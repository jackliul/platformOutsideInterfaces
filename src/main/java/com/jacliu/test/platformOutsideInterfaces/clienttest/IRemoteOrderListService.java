package com.jacliu.test.platformOutsideInterfaces.clienttest;

import net.intelink.openapi.client.sdk.ApiException;
import net.intelink.openapi.client.sdk.Command;

public interface IRemoteOrderListService {

	/**
	 * 测试获取订单列表
	 * 
	 * @return
	 */
	@Command(name = "getOrderList", version = "1.4")
	OrderListDataResult[] getOrderList(OrderListReqDataParam orderListReqDataParam) throws ApiException;

}
