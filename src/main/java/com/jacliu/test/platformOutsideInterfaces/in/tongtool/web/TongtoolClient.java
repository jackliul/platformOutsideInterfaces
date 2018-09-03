package com.jacliu.test.platformOutsideInterfaces.in.tongtool.web;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

import com.jacliu.test.platformOutsideInterfaces.common.web.model.ResultModel;
import com.jacliu.test.platformOutsideInterfaces.common.web.util.RespUtil;

public class TongtoolClient {

	@Resource
	private RabbitTemplate rabbitTemplate;

	@SuppressWarnings("rawtypes")
	public ResultModel direct(String p) {
		CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
		rabbitTemplate.convertAndSend("tongtool_getOrder_in_X", "tongtool_getOrder_in_R", p, correlationData);
		return RespUtil.success();
	}

}
