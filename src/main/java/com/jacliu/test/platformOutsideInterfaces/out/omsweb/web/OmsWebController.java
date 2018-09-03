package com.jacliu.test.platformOutsideInterfaces.out.omsweb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jacliu.test.platformOutsideInterfaces.clienttest.OrderListDataResult;
import com.jacliu.test.platformOutsideInterfaces.clienttest.OrderListReqDataParam;
import com.jacliu.test.platformOutsideInterfaces.common.enums.EnumResCode;
import com.jacliu.test.platformOutsideInterfaces.common.exception.ControllerException;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.RequestHeader;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.RequestModel;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.ResultModel;
import com.jacliu.test.platformOutsideInterfaces.common.web.util.RequestUtil;
import com.jacliu.test.platformOutsideInterfaces.common.web.util.RespUtil;
import com.jacliu.test.platformOutsideInterfaces.out.omsweb.vo.req.OrderListReq;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping("omsWebApi/")
@Api("omsWeb相关的api")
public class OmsWebController {

	@Autowired
	private RequestUtil requestUtil;

	@ApiOperation(value = "getNoPartnerCompanyNoClientele", httpMethod = "POST", notes = "根据订单编号获取该公司的订单列表")
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping("getOrderList/1.4")
	public ResultModel<OrderListDataResult> getNoPartnerCompanyNoClientele(RequestHeader head,
			@ApiParam(value = "{\"companyNo\":\"JHE\",\"orderNo\":\"or001\"}", example = "{\"companyNo\":\"JHE\",\"orderNo\":\"or001\"}") OrderListReqDataParam orderListReq,
			@ApiParam(hidden = true) String body) throws ControllerException {

		// System.out.println("orderListReq.toString() " + orderListReq.toString());

		RequestModel<OrderListReq> requestModel = requestUtil.getRequestModel(head, body, OrderListReq.class);
		String companyNo = requestModel.getBody().getCompanyNo();
		System.out.println("requestModel :: " + companyNo);

		// String token = requestModel.getHeader().getToken();

		OrderListDataResult[] orderListRes = new OrderListDataResult[3];
		orderListRes[0] = new OrderListDataResult("order001", "comp001", "client001");
		orderListRes[1] = new OrderListDataResult("order002", "comp002", "client002");
		orderListRes[2] = new OrderListDataResult("order003", "comp003", "client003");
		ResultModel result = RespUtil.result(EnumResCode.OK, orderListRes);
		return result;
	}

}
