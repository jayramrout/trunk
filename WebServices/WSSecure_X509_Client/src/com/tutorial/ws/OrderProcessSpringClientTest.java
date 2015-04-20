package com.tutorial.ws;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
/**
 * Order Client using Spring
 * @author jrout
 *
 */
@ContextConfiguration("classpath:client-beans.xml")
public class OrderProcessSpringClientTest extends AbstractJUnit4SpringContextTests {
	private static final Logger LOGGER = Logger.getLogger(OrderProcessSpringClientTest.class);
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testOrderProcess() {
		OrderProcess orderProcess = (OrderProcess)applicationContext.getBean("orderClient");
		Order order = new Order();
        order.setCustomerID("001");
        order.setItemID("Item01");
        order.setPrice(20);
        order.setQty(1);
        
        String orderConfId = orderProcess.processOrder(order);
        LOGGER.info("OrderProcessClient.main()" + orderConfId);
	}
	/*public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"client-beans.xml"});
		OrderProcess orderProcess = (OrderProcess) context. getBean("orderClient");
		Order order = new Order();
        order.setCustomerID("001");
        order.setItemID("Item01");
        order.setPrice(20);
        order.setQty(1);
        
        String orderConfId = orderProcess.processOrder(order);
        System.out.println("OrderProcessClient.main()" + orderConfId);
	}*/
}
