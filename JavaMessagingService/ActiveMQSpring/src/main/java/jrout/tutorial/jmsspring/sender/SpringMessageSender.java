package jrout.tutorial.jmsspring.sender;

import java.util.Map;

import org.springframework.jms.core.JmsTemplate;

/**
 * @author Jayram
 *
 */
public class SpringMessageSender {

	private final JmsTemplate jmsTemplate;

	public SpringMessageSender(final JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void send(final Map map) {
		jmsTemplate.convertAndSend(map);
	}
}