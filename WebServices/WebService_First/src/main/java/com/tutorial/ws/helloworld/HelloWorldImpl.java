package com.tutorial.ws.helloworld;

import javax.jws.WebService;

/**
 * @author Jayram
 * Second Create a Web Service Endpoint Implementation
 */
@WebService(endpointInterface="com.tutorial.ws.helloworld.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
@Override
	public String getHelloWorld(String name, String nametwo) {
		return "Hello World Welcome " + name;
	}
}