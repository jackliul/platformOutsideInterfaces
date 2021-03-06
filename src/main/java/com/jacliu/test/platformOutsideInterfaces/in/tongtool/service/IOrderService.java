package com.jacliu.test.platformOutsideInterfaces.in.tongtool.service;

import java.util.List;
import java.util.Map;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.service.BaseService;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.BOrder;

public interface IOrderService extends BaseService<BOrder> {

	List<BOrder> find(Map<String, Object> params);

}
