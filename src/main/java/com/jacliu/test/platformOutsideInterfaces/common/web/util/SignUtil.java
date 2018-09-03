package com.jacliu.test.platformOutsideInterfaces.common.web.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jacliu.test.platformOutsideInterfaces.common.enums.EnumResCode;
import com.jacliu.test.platformOutsideInterfaces.common.exception.BaseException;
import com.jacliu.test.platformOutsideInterfaces.common.redis.service.IRedisService;
import com.jacliu.test.platformOutsideInterfaces.common.web.domain.SOmsConfig;
import com.jacliu.test.platformOutsideInterfaces.common.web.mapper.SOmsConfigMapper;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.RequestHeader;

@Component
public class SignUtil {
	// private Lock locker = new ReentrantLock();
	private Field[] headFields = null;
	private Class<?> headClass = RequestHeader.class;
	private final Logger logger = LoggerFactory.getLogger(SignUtil.class);

	@Autowired
	private SOmsConfigMapper omsConfigMapper;

	@Autowired
	@Qualifier("zmDevRedisService")
	private IRedisService zmDevRedisService;

	/**
	 * 生成签名
	 * 
	 * @param head
	 * @param bodyStr
	 * @return
	 */
	public String genSign(RequestHeader head, String bodyStr) {
		logger.info("请求参数内容：{}", head);
		logger.info("请求内容：{}", bodyStr);
		// 检查head类字段缓存
		if (null == headFields) {
			// locker.lock();// 加锁，因为是全局缓存
			try {
				// double check
				if (null == headFields) {
					// 缓存请求头的字段，因为加载后就不会变，所以缓存后更高效
					headFields = headClass.getDeclaredFields();
				}
			} finally {
				// locker.unlock();
			}
		}

		SortedMap<String, String> parms = new TreeMap<>();
		parms.put("body", bodyStr);

		for (Field field : headFields) {
			// 静态字段不需要用作签名运算
			if (Modifier.isStatic(field.getModifiers())) {
				continue;
			}
			String fieldName = field.getName();
			// 本次是服务端反向生成sign。客户端带过来的sign需要过滤掉。
			if ("sign".equals(fieldName)) {
				continue;
			}
			// getter 需要把字段第一位大写，并加get前缀
			String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
			Object val = null;
			try {
				Method method = headClass.getMethod(methodName);
				val = method.invoke(head);
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
				// 如果实在没有这个字段或有其它问题，就跳过
				continue;
			}

			// 目前head只支持String和int类型的字段
			if (field.getType().equals(String.class)) {
				parms.put(fieldName, null == val ? "" : (String) val);
			} else if (field.getType().equals(int.class)) {
				parms.put(fieldName, null == val ? "0" : val.toString());
			}
		}

		StringBuilder sBuilder = new StringBuilder();
		Set<String> keys = parms.keySet();
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			sBuilder.append(parms.get(key));
		}
		// 最后一定要加上 appkey TODO
		String omsAppkey = getOmsAppkey(head.getAppid());
		sBuilder.append(omsAppkey);

		return getMd5(sBuilder.toString());
	}

	private String getMd5(String src) {
		String md5str = "";

		try {
			// 1 创建一个提供信息摘要算法的对象，初始化为md5算法对象
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 2 将消息变成byte数组
			byte[] input = src.getBytes("UTF-8");
			// 3 计算后获得字节数组,这就是那128位了
			byte[] buff = md.digest(input);
			// 4 把数组每一字节（一个字节占八位）换成16进制连成md5字符串
			md5str = bytesToHex(buff, 4, 12);
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return md5str;
	}

	private String bytesToHex(byte[] bytes, int start, int end) {
		StringBuffer md5str = new StringBuffer();
		// 把数组每一字节换成16进制连成md5字符串
		int digital;
		for (int i = start; i < end; i++) {
			digital = bytes[i];

			if (digital < 0) {
				digital += 256;
			}
			if (digital < 16) {
				md5str.append("0");
			}
			md5str.append(Integer.toHexString(digital));
		}
		return md5str.toString().toLowerCase();
	}

	public boolean checkSign(RequestHeader head, String body) throws BaseException {
		String clientSign = head.getSign();
		if (StringUtils.isEmpty(clientSign))
			throw new BaseException(EnumResCode.DEVICE_NO_AUTHZ, "sign为空,无法校验", "请添加sign");
		String serverSign = genSign(head, body);
		logger.info("clientSign:: " + clientSign);
		logger.info("serverSign:: " + serverSign);
		if (!serverSign.equals(clientSign)) {
			throw new BaseException(EnumResCode.DEVICE_NO_AUTHZ, "sign不对", "请按文档生成正确的sign");
		}
		return serverSign.equals(clientSign);
	}

	private String getOmsAppkey(String appid) {
		String key = "INTERFACE:" + appid + ":GETORDERLIST";
		String hashKey = "INTERFACE:GETORDERLIST";
		String omsAppKey = zmDevRedisService.hget(key, hashKey);

		if (null == omsAppKey) {
			SOmsConfig omsConfig = new SOmsConfig(appid);
			SOmsConfig dbSmsConfig = omsConfigMapper.selectOne(omsConfig);
			omsAppKey = dbSmsConfig.getOmsAppkey();
			zmDevRedisService.hput(key, hashKey, omsAppKey);
		}
		return omsAppKey;
	}
}
