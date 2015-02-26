package com.tutorial.jms.receiver;

/**
 * 
 */

/**
 * @author Jayram
 *
 */
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class StartMessageReceiver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-jms-receiver.xml");
	}
}