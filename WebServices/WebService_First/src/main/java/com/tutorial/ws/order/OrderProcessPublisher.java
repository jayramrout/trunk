package com.tutorial.ws.order;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
/**
 * It is recommended that developers explicitly implement OrderProcess SEI, though it may not be necessary
 */
@WebService
public class OrderProcessPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9998/ws/orderProcess", new OrderProcessImpl());
		System.out.println("Order Process Published...");
	}
}
