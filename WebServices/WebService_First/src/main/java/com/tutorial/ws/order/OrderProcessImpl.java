package com.tutorial.ws.order;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import org.apache.cxf.message.Message;
/**
 * It is recommended that developers explicitly implement OrderProcess SEI, though it may not be necessary
 */
@WebService(serviceName="OrderProcessService",portName="OrderProcessPort", endpointInterface="com.tutorial.ws.order.OrderProcess")
public class OrderProcessImpl implements OrderProcess {

	@Resource
	WebServiceContext wsc;
	
	@Override
    public String processOrder(Order order) {
    	
		System.out.println("Getting the operation info from the message context ");
		MessageContext ctx = wsc.getMessageContext();
		QName operation = (QName) ctx.get(Message.WSDL_OPERATION);

		System.out.println("The operation name is " + operation);

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
			return custID+" " + itemID;
		}
		return null;
	}
}
