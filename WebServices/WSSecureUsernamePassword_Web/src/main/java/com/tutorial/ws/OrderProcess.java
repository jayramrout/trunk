package com.tutorial.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService // It signifies that this interface is not an ordinary interface but a web service interface.
// @WebService annotation is part of the JAX-WS annotation library.
public interface OrderProcess {
	/*
	 * @WebMethod is an optional annotation is optional and is used for customizing the
     *	web service operation.
     * Provides the operation name and the action elements which are used to customize the name attribute of the operation
	 * and the SOAP action element in the WSDL document
	 */
    @WebMethod String processOrder(Order order); 
}

