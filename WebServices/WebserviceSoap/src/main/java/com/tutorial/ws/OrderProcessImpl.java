package com.tutorial.ws;

import javax.jws.WebService;
/**
 * It is recommended that developers explicitly implement OrderProcess SEI, though it may not be necessary
 */
@WebService(serviceName="OrderProcessService",portName="OrderProcessPort" , endpointInterface="com.tutorial.ws.OrderProcess")
public class OrderProcessImpl implements OrderProcess {

    public String processOrder(Order order) {
		String orderID = validate(order);
        return orderID;
    }

	/**
	 * Validates the order and returns the order ID
	**/
	private String validate(Order order) {
		String custID = order.getCustomerID();
		String itemID = order.getItemID();
		int qty = order.getQty();
		double price = order.getPrice();

		if (custID != null && itemID != null && !custID.equals("") && !itemID.equals("") && qty > 0 && price > 0.0) {
			return "ORD1234";
		}
		return null;
	}
}
