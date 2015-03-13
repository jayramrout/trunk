package com.tutorial.ws;

import javax.jws.WebService;
/**
 * It is recommended that developers explicitly implement OrderProcess SEI, though it may not be necessary
 */
@WebService(serviceName="OrderProcessService",portName="OrderProcessPort" , endpointInterface="com.tutorial.ws.OrderProcess")
public class OrderProcessImpl implements OrderProcess {

	public void processOrder(Order order) {
		System.out.println("Customer ID is "+ order.getCustomerID());
	}
}