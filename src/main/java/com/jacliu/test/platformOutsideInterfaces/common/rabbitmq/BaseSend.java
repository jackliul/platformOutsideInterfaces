package com.jacliu.test.platformOutsideInterfaces.common.rabbitmq;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

import com.jacliu.test.platformOutsideInterfaces.common.rabbitmq.dto.BaseRabbitDto;

public abstract class BaseSend {

	@Resource
	private RabbitTemplate rabbitTemplate;

	private void send(BaseRabbitDto rabbitDto) throws Exception {
		try {
			CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
			rabbitTemplate.convertAndSend(rabbitDto.getExchange(), rabbitDto.getRoutingKey(), rabbitDto.getMsg(),
					correlationData);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	protected void sendMsg(BaseRabbitDto rabbitDto) throws Exception {
		try {
			send(rabbitDto);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
