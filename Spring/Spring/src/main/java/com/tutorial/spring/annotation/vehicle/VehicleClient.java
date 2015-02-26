package com.tutorial.spring.annotation.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Jayram
 *
 */
public class VehicleClient {
//	Vehicle v = (Vehicle)ctx.getBean("vehicle");
	public static void main(String arg[]){
		String appXML = "com/tutorial/spring/annotation/vehicle/applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(appXML);
//		Vehicle vehicle = (Vehicle)ctx.getBean("vehicle");
		
	}
}