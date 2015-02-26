package com.tutorial.ws.helloworld;

import javax.xml.ws.Endpoint;

/**
 * @author Jayram
 * Third Create a Endpoint Publisher
 */
public class HelloWorldPublisher {
	
	public static void main(String[] args) {
		/*
		 * You can access the WSDL using http://localhost:9999/ws/hello?wsdl
		 */
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
		System.out.println(" Hello world Service Published...");
	}
}