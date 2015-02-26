package com.tutorial.ws.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * @author Jayram
 * First Create a Web Service Endpoint Interface
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.WRAPPED , use= Use.LITERAL)
public interface HelloWorld {
	@WebMethod String getHelloWorld(String name, String nametwo);
}