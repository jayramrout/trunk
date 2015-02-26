package com.tutorial.ws.order;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

 // @WebService signifies that this interface is not an ordinary interface but a web service interface.
// @WebService annotation is part of the JAX-WS annotation library.
//The Service EndPoint Interface(SEI) directly corresponds to a wsdl:portType element

@WebService
@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.BARE , use= Use.LITERAL)
public interface OrderProcess {
	/*
	 * @WebMethod is an optional annotation is optional and is used for customizing the
     *	web service operation.
     * Provides the operation name and the action elements which are used to customize the name attribute of the operation
	 * and the SOAP action element in the WSDL document
	 * The methods defined by SEI correspond to the wsdl:operation element.
	 */
    @WebMethod 
    String processOrder(Order orderOne); 
}