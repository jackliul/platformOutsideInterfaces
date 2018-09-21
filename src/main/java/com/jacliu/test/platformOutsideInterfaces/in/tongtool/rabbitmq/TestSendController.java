package com.jacliu.test.platformOutsideInterfaces.in.tongtool.rabbitmq;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jacliu.test.platformOutsideInterfaces.common.web.model.ResultModel;
import com.jacliu.test.platformOutsideInterfaces.common.web.util.RespUtil;

@RestController
@RequestMapping("/testRabbit")
public class TestSendController {

	@Resource
	private RabbitTemplate rabbitTemplate;

	@SuppressWarnings("rawtypes")
	@RequestMapping("/tongtool_getOrder")
	@ResponseBody
	public ResultModel direct(String p) throws RuntimeException {
		CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
		rabbitTemplate.convertAndSend("tongtool_getOrder_in_X", "tongtool_getOrder_in_R", p, correlationData);
		return RespUtil.success();
	}
}