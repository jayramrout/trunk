package com.tutorial.ws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Order Client using Java API's
 * @author jrout
 *
 */
public class OrderProcessClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8080/WSSecureUsernamePassword_Web/OrderProcess?wsdl");
        QName qname = new QName("http://ws.tutorial.com/", "OrderProcessImplService");
        Service service = Service.create(url, qname);
        OrderProcess orderProcess = service.getPort(OrderProcess.class);
        Order order = new Order();
        order.setCustomerID("001");
        order.setItemID("Item01");
        order.setPrice(20);
        order.setQty(1);
        
        String orderConfId = orderProcess.processOrder(order);
        System.out.println("OrderProcessClient.main()" + orderConfId);
	}
}