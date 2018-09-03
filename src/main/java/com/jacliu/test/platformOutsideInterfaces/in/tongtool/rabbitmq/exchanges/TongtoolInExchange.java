package com.jacliu.test.platformOutsideInterfaces.in.tongtool.rabbitmq.exchanges;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TongtoolInExchange {

	@Bean("tongtool_getOrder_in_X")
	public Exchange tongtoolGetOrderInExchange() {
		return ExchangeBuilder.directExchange("tongtool_getOrder_in_X").durable(true).build();
	}

	@Bean("tongtool_getOrder_in_X_DEAD")
	public Exchange tongtoolGetOrderInDeadExchange() {
		return ExchangeBuilder.directExchange("tongtool_getOrder_in_X_DEAD").durable(true).build();
	}

}
