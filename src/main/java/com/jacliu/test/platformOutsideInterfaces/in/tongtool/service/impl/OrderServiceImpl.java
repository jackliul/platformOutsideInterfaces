package com.jacliu.test.platformOutsideInterfaces.in.tongtool.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.basemapper.BaseMapper;
import com.jacliu.test.platformOutsideInterfaces.common.mybatis.service.BaseServiceImpl;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.BOrder;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.mapper.BOrderMapper;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.service.IOrderService;

@Component
public class OrderServiceImpl extends BaseServiceImpl<BOrder> implements IOrderService {

	@Autowired
	private BOrderMapper orderMapper;

	@Override
	protected BaseMapper<BOrder> getMapper() {
		return orderMapper;
	}

	@Override
	public List<BOrder> find(Map<String, Object> params) {
		params.put("order", 111);
		List<BOrder> orders = orderMapper.find(params);
		for (BOrder bOrder : orders) {
			System.out.println(bOrder.getOrderNo());
		}

		return orders;
	}

}
