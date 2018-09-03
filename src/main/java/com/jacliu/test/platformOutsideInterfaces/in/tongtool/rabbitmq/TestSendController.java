package com.jacliu.test.platformOutsideInterfaces.in.tongtool.rabbitmq;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
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

	@SuppressWarnings("rawtypes")
	@RequestMapping("/tongtool_dead_getOrder")
	@ResponseBody
	public ResultModel deadDirect(String p) {
		CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
		// 声明消息处理器 这个对消息进行处理 可以设置一些参数 对消息进行一些定制化处理 我们这里 来设置消息的编码 以及消息的过期时间 因为在.net
		// 以及其他版本过期时间不一致 这里的时间毫秒值 为字符串
		MessagePostProcessor messagePostProcessor = message -> {
			MessageProperties messageProperties = message.getMessageProperties();
			// 设置编码
			messageProperties.setContentEncoding("utf-8");
			// 设置过期时间10*1000毫秒
			// messageProperties.setExpiration("60000");
			// messageProperties.setExpiration("180000");
			messageProperties.setExpiration("100");
			return message;
		};

		// 向DL_QUEUE 发送消息 10*1000毫秒后过期 形成死信
		rabbitTemplate.convertAndSend("tongtool_getOrder_in_X_DEAD", "tongtool_getOrder_in_R_DEAD", p,
				messagePostProcessor, correlationData);
		return RespUtil.success();
	}
}