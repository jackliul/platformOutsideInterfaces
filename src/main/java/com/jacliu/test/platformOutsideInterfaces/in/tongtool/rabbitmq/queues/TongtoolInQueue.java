package com.jacliu.test.platformOutsideInterfaces.in.tongtool.rabbitmq.queues;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TongtoolInQueue {

	/**
	 * 声明一个队列 支持持久化.
	 *
	 * @return the queue
	 */
	@Bean("tongtool_getOrder_in_Q")
	public Queue directQueue() {
		Map<String, Object> args = new HashMap<>(3);
		args.put("x-message-ttl", 60000);
		// x-dead-letter-exchange 声明 死信交换机
		args.put("x-dead-letter-exchange", "tongtool_getOrder_in_X_DEAD");
		// x-dead-letter-routing-key 声明 死信路由键
		args.put("x-dead-letter-routing-key", "tongtool_getOrder_in_R");
		return QueueBuilder.durable("tongtool_getOrder_in_Q").withArguments(args).build();
	}

	// 【死信队列里的死信路由键 routingKey 跟 正常健路由routingKey一样的】
	@Bean("tongtool_getOrder_in_Q_DEAD")
	public Queue deadLetterQueue() {
		return QueueBuilder.durable("tongtool_getOrder_in_Q_DEAD").build();
	}
}
