package com.tutorial.spring.aop_04._02BasedonReturnValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String [] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/tutorial/spring/aop_04/_02BasedonReturnValue/springconfig.xml");
		IBusinessLogic testObject = (IBusinessLogic) ctx.getBean("proxyobj");
		int res=testObject.method1();
		System.out.println("test result :"+res);
	}
}