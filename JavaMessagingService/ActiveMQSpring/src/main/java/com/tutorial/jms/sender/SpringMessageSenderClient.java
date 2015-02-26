package com.tutorial.jms.sender;

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
 
public class SpringMessageSenderClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-jms-sender.xml");

		SpringMessageSender sender = (SpringMessageSender) ctx.getBean("messageSender");
		Map map = new HashMap();
		map.put("Name", "Jayram Rout");
		map.put("Place", "Concord");
		sender.send(map);
		
		ctx.close();
	}
}