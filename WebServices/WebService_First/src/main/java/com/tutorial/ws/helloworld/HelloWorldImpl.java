package com.tutorial.ws.helloworld;

import javax.jws.WebService;

/**
 * @author Jayram
 * Second Create a Web Service Endpoint Implementation
 * NOTE : implementing HelloWorld is not compulsory
 */
@WebService(endpointInterface="com.tutorial.ws.helloworld.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String getHelloWorld(String firstName, String lastName) {
		return "Hello World Welcome " + firstName +" " + (lastName != null ? lastName :"");
	}
}