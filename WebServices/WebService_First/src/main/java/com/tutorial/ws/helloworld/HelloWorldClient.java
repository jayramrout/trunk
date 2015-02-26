package com.tutorial.ws.helloworld;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://localhost:9999/ws/hello?wsdl");
			 
			/*
			 * QName represents a qualified name . 
			 * Here it takes Service URI and Service Name in the constructor.
			 * Service URI is on opposite order of the package name
			 */
	        QName qname = new QName("http://helloworld.ws.tutorial.com/", "HelloWorldImplService");
	        Service service = Service.create(url, qname);
	        HelloWorld hello = service.getPort(HelloWorld.class);
	        System.out.println(hello.getHelloWorld("Hello Guys !!!","Hi"));
		}catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}