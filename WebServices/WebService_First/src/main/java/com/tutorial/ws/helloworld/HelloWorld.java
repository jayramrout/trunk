package com.tutorial.ws.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Jayram First Create a Web Service Endpoint Interface
 * NOTE : @XmlElement annotation makes the argument compulsory.
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.WRAPPED, use = Use.LITERAL)
public interface HelloWorld {
	@WebMethod
	String getHelloWorld(@XmlElement(required = true) String firstName, String lastName);
}