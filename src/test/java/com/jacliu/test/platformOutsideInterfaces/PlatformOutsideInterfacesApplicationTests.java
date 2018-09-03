package com.jacliu.test.platformOutsideInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.config.DBContextHolder;
import com.jacliu.test.platformOutsideInterfaces.common.mybatis.config.DBTypeEnum;
import com.jacliu.test.platformOutsideInterfaces.common.mybatis.utils.DataSourceSwitcher;
import com.jacliu.test.platformOutsideInterfaces.common.mybatis.utils.DataSourceSwitcher.CallBack;
import com.jacliu.test.platformOutsideInterfaces.common.redis.service.IRedisService;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.BOrder;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.SUser;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.service.IOrderService;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.service.IUserService;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.vo.res.oms.OrderListRes;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PlatformOutsideInterfacesApplicationTests {

	@Autowired
	private IOrderService orderService;

	@Autowired
	private IUserService userService;

	@Autowired
	@Qualifier("zmDevRedisService")
	private IRedisService zmDevRedisService;

	@Autowired
	@Qualifier("zmTestRedisService")
	private IRedisService zmTestRedisService;

	@Autowired
	@Qualifier("dozerMapper")
	protected Mapper dozerMapper;

	@Test
	public void contextLoads() {
	}

	// juit跟真实的request想成上有一定区别
	@Test
	public void testMybatis() {

		System.out.println(DBContextHolder.getDBType());

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("order", 1111);
		List<BOrder> orders = orderService.find(params);
		for (BOrder bOrder : orders) {
			System.out.println(bOrder.getOrderNo());
		}

		DataSourceSwitcher.execute(DBTypeEnum.DB_USERCENTER, new CallBack() {

			@Override
			public void run() {
				System.out.println("222 :: " + DBContextHolder.getDBType().getValue());

				List<SUser> users = userService.find(params);
				for (SUser sUser : users) {
					System.out.println(sUser.getUserNo());
				}
			}
		});

	}

	@Test
	public void testRedis() {

		zmTestRedisService.hput("SESSION:BATCHCARRIERSITE_UPDATEMARK_test",
				"SESSION:YRD:BATCHCARRIERSITE_UPDATEMARK_test", "nihao");
		String aaa = zmTestRedisService.hget("SESSION:BATCHCARRIERSITE_UPDATEMARK_test",
				"SESSION:YRD:BATCHCARRIERSITE_UPDATEMARK_test");
		System.out.println("aaa :: " + aaa);

		String test = zmTestRedisService.hget("SESSION:GETTMSCOUNTRY_UPDATEMARK",
				"SESSION:YRD:GETTMSCOUNTRY_UPDATEMARK");

		String test2 = zmTestRedisService.hget("SESSION:HXU:GETTMSCOUNTRY_UPDATEMARK",
				"SESSION:GETTMSCOUNTRY_UPDATEMARK");

		System.out.println(test);
		System.out.println(test2);
	}

	@Test
	public void testDozer() {
		OrderListRes omsOrderListRes = new OrderListRes("omsNum", "omsName");
		com.jacliu.test.platformOutsideInterfaces.in.tongtool.vo.res.tongtu.OrderListRes map = dozerMapper.map(
				omsOrderListRes,
				com.jacliu.test.platformOutsideInterfaces.in.tongtool.vo.res.tongtu.OrderListRes.class);

		System.out.println(map.toString());
	}
}
