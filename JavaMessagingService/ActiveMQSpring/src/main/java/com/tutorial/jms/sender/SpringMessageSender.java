package com.tutorial.jms.sender;

/**
 * 
 */

/**
 * @author Jayram
 *
 */
import java.util.Map;

import org.springframework.jms.core.JmsTemplate;

public class SpringMessageSender {

	private final JmsTemplate jmsTemplate;

	public SpringMessageSender(final JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void send(final Map map) {
		jmsTemplate.convertAndSend(map);
	}
}