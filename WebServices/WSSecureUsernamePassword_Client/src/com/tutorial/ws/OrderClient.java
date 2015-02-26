package com.tutorial.ws;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;

public class OrderClient {

	public static void main(String[] args) {
		OrderProcessImplService service = new OrderProcessImplService();
		OrderProcess process = service.getOrderProcessImplPort();

		org.apache.cxf.endpoint.Client client = ClientProxy.getClient(process);
		org.apache.cxf.endpoint.Endpoint cxfEndpoint = client.getEndpoint();
		
		Map<String,Object> outProps = new HashMap<String,Object>();
		outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		outProps.put(WSHandlerConstants.USER, "excel");
		outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS,ClientPasswordHandler.class.getName());

		WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
		cxfEndpoint.getOutInterceptors().add(wssOut);
		
		Order order = new Order();
		order.setCustomerID("001");
		order.setItemID("Item01");
		order.setPrice(20);
		order.setQty(1);
		System.out.println(process.processOrder(order));
	}

}
