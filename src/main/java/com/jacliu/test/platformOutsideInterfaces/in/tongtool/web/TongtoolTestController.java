package com.jacliu.test.platformOutsideInterfaces.in.tongtool.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.BOrder;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.SUser;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.service.IOrderService;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.service.IUserService;

@Controller
public class TongtoolTestController {

	@Autowired
	private IOrderService orderService;

	@Autowired
	private IUserService userService;

	@RequestMapping("/tongtoolTest")
	@ResponseBody
	public String test() {
		Map<String, Object> params = new HashMap<>();
		List<BOrder> orders = orderService.find(params);
		for (BOrder bOrder : orders) {
			System.out.println(bOrder.getOrderNo());
		}

		List<SUser> users = userService.find(params);
		for (SUser sUser : users) {
			System.out.println(sUser.getUserNo());
		}
		return "ok";
	}
}
