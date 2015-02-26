package com.tutorial.spring.aop_04._01aroundAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/aop_04/_01aroundAdvice/springconfig.xml");
		IBusinessLogic testObject = (IBusinessLogic) ctx.getBean("proxyobj");
		testObject.deposit();
		// testObject.withdraw();
	}
}