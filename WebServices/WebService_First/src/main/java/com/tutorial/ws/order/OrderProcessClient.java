package com.tutorial.ws.order;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class OrderProcessClient {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://localhost:9998/ws/orderProcess?wsdl");
			 
			/*
			 * QName represents a qualified name . 
			 * Here it takes Service URI and Service Name in the constructor.
			 * Service URI is on opposite order of the package name
			 */
	        QName qname = new QName("http://order.ws.tutorial.com/", "OrderProcessService");
	        Service service = Service.create(url, qname);
	        OrderProcess orderProcess = service.getPort(OrderProcess.class);
	        
	        Order order = new Order();
	        order.setCustomerID("001");
	        order.setItemID("Item01");
	        order.setPrice(20);
	        order.setQty(1);
	        
	        System.out.println(orderProcess.processOrder(order));
		}catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
