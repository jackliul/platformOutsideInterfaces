package com.jacliu.test.platformOutsideInterfaces.clienttest;

import org.junit.Test;

import net.intelink.openapi.client.sdk.JsonClientSdk;

public class ClientTest {

	@Test
	public void testProtocol() {
		JsonClientSdk<IRemoteOrderListService> sdk = new JsonClientSdk<IRemoteOrderListService>(
				IRemoteOrderListService.class, "http://127.0.0.1:8088/omsWebApi/getOrderList/1.4", "1.4",
				"testOmsAppid", "testOmsAppKey", "testOmsSecret", "tester", 0, "", "FastJson");

		OrderListReqDataParam orderListReqDataParam = new OrderListReqDataParam();
		orderListReqDataParam.setCompanyNo("FDE");
		OrderListDataResult[] orderList = sdk.getProxy().getOrderList(orderListReqDataParam);
		for (OrderListDataResult orderListRes : orderList) {
			System.out.println(orderListRes.getCompanyNo() + " ::: " + orderListRes.getClientName() + " ::: "
					+ orderListRes.getClientNo());
		}
	}
}
