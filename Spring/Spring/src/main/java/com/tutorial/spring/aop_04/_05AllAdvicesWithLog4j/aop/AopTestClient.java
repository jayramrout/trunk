package com.tutorial.spring.aop_04._05AllAdvicesWithLog4j.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTestClient {

	public static void main(String args[]){

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/aop_04/_05AllAdvicesWithLog4j/aop/aop-test.xml");
		Adder adder = (Adder)ctx.getBean("proxy");
		int result = adder.add(0, 0);
//		int result = adder.add(10, 20);
		System.out.println("Result = " + result);      
	}
}

