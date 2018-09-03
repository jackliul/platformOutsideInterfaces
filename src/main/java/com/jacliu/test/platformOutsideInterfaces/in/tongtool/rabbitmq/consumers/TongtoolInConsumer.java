package com.jacliu.test.platformOutsideInterfaces.in.tongtool.rabbitmq.consumers;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;

@Component
public class TongtoolInConsumer {

	private static final Logger log = LoggerFactory.getLogger(TongtoolInConsumer.class);

	@Resource
	private RabbitTemplate rabbitTemplate;

	@RabbitListener(queues = { "tongtool_getOrder_in_Q" })
	public void on(Message message, Channel channel) throws Exception {

		try {
			log.debug("message.getBody() :: {} ", message.getBody());
			String aa = null;
			System.out.println(aa.length());
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		} catch (Exception e) {
			channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
			throw new Exception(e);
		}

	}

}
