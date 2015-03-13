package com.tutorial.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
@WebService
@SOAPBinding(style= Style.DOCUMENT, parameterStyle= ParameterStyle.BARE, use= Use.LITERAL)
public interface OrderProcess {
    @WebMethod 
    void processOrder(Order order); 
}