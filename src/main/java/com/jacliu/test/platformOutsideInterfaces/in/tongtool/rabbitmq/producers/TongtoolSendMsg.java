package com.jacliu.test.platformOutsideInterfaces.in.tongtool.rabbitmq.producers;

import org.springframework.stereotype.Component;

import com.jacliu.test.platformOutsideInterfaces.common.rabbitmq.BaseSend;
import com.jacliu.test.platformOutsideInterfaces.common.rabbitmq.dto.BaseRabbitDto;

@Component
public class TongtoolSendMsg extends BaseSend {

	@Override
	protected void sendMsg(BaseRabbitDto rabbitDto) throws Exception {
		try {
			BaseRabbitDto baseRabbitDto = new BaseRabbitDto("tongtool_getOrder_in_X", "tongtool_getOrder_in_Q",
					rabbitDto);
			super.sendMsg(baseRabbitDto);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

}
