package com.jacliu.test.platformOutsideInterfaces.common.rabbitmq.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BaseRabbitDto implements Serializable {

	/**
	 */
	private static final long serialVersionUID = 1L;

	private String routingKey;
	private String exchange;

	private Object msg;

	public BaseRabbitDto() {
		super();
	}

	public BaseRabbitDto(String routingKey, String exchange, Object msg) {
		super();
		this.routingKey = routingKey;
		this.exchange = exchange;
		this.msg = msg;
	}

	public String getRoutingKey() {
		return routingKey;
	}

	public void setRoutingKey(String routingKey) {
		this.routingKey = routingKey;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public Object getMsg() {
		return msg;
	}

	public void setMsg(Object msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

}
