package com.tutorial.ws.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.ws.Order;
import com.tutorial.ws.OrderProcess;

/**
 * Order Client using Spring
 * @author jrout
 *
 */
public class OrderProcessSpringClient {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"client-applicationContext.xml"});
		OrderProcess orderProcess = (OrderProcess) context. getBean("orderClient");
		
		Order order = new Order();
        order.setCustomerID("001");
        order.setItemID("Item01");
        order.setPrice(20);
        order.setQty(1);
        
        String orderConfId = orderProcess.processOrder(order);
        System.out.println("OrderProcessClient.main()" + orderConfId);
	}
}
