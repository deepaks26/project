package com.inter.rabbitmq.RabbitMq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMsgListner implements MessageListener {

	@Override
	public void onMessage(Message message) {
		System.out.println("Consuming Message - " + new String(message.getBody()));		
	}

}
