package com.jacliu.test.platformOutsideInterfaces.common.rabbitmq;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	@Resource
	private RabbitTemplate rabbitTemplate;

	/**
	 * 定制化amqp模版 可根据需要定制多个
	 * 
	 * 此处为模版类定义 Jackson消息转换器 ConfirmCallback接口用于实现消息发送到RabbitMQ交换器后接收ack回调
	 * 即消息发送到exchange ack ReturnCallback接口用于实现消息发送到RabbitMQ 交换器，但无相应队列与交换器绑定时的回调
	 * 即消息发送不到任何一个队列中 ack
	 *
	 * @return the amqp template
	 */
	@SuppressWarnings("deprecation")
	@Bean
	public AmqpTemplate amqpTemplate() {
		Logger log = LoggerFactory.getLogger(RabbitTemplate.class);

		// 使用jackson 消息转换器
		rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
		rabbitTemplate.setEncoding("UTF-8");
		// 开启returncallback yml 需要 配置 publisher-returns: true
		rabbitTemplate.setMandatory(true);
		// 消息确认 yml 需要配置 publisher-returns: true
		rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
			if (ack) {
				log.debug("消息发送到exchange成功,id: {}", correlationData.getId());
			} else {
				log.debug("消息发送到exchange失败,原因: {}", cause);
			}
		});
		rabbitTemplate.setReturnCallback((message, replyCode, replyText, exchange, routingKey) -> {
			String correlationId = message.getMessageProperties().getCorrelationIdString();
			log.debug("消息：{} 发送失败, 应答码：{} 原因：{} 交换机: {}  路由键: {}", correlationId, replyCode, replyText, exchange,
					routingKey);
		});
		return rabbitTemplate;
	}

	@Bean
	public Binding tongtoolGetOrderInBinding(@Qualifier("tongtool_getOrder_in_Q") Queue queue,
			@Qualifier("tongtool_getOrder_in_X") Exchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("tongtool_getOrder_in_R").noargs();
	}

	@Bean
	public Binding tongtoolGetOrderInDeadBinding(@Qualifier("tongtool_getOrder_in_Q_DEAD") Queue queue,
			@Qualifier("tongtool_getOrder_in_X_DEAD") Exchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("tongtool_getOrder_in_R").noargs();
	}

	// @Bean
	// public Binding
	// tongtoolGetOrderInRedictBinding(@Qualifier("tongtool_getOrder_in_REDIRECT")
	// Queue queue,
	// @Qualifier("tongtool_getOrder_in_X_DEAD") Exchange exchange) {
	// return
	// BindingBuilder.bind(queue).to(exchange).with("tongtool_getOrder_in_R_DEAD").noargs();
	// }

}