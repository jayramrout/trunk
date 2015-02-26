/**
 * 
 */
package com.tutorial.ws.helloworld;

/**
 * @author Jayram
 *
 */
public class HelloWorldClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorldImplService service = new HelloWorldImplService();
		HelloWorld helloWorld = service.getHelloWorldImplPort();
		System.out.println(helloWorld.getHelloWorld("Jayram"));
	}
}