package com.jacliu.test.platformOutsideInterfaces.common.web.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.RequestHeader;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.RequestModel;

@Component
public class RequestUtil {

	@Autowired
	private SignUtil signUtil;

	/**
	 * 获取请求Model
	 * 
	 * @param t
	 * @return
	 */
	public <T> RequestModel<T> getRequestModel(RequestHeader header, String body, Class<T> t) {
		signUtil.checkSign(header, body);

		RequestModel<T> requertModel = new RequestModel<>();
		requertModel.setHeader(header);
		if (t != null) {
			if (StringUtils.isNotEmpty(body)) {
				requertModel.setBody(JSON.parseObject(body, t));
			}
		}
		return requertModel;
	}

}
