package com.tutorial.spring.aop_04._03Parameters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApplication
{
	public static void main(String [] args)
	{
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/tutorial/spring/aop_04/_03Parameters/springconfig.xml");
		IBusinessLogic testObject = (IBusinessLogic) ctx.getBean("proxyobj");
		testObject.method1(22,"Manoj Tiwari");
		/*testObject.method1(-22,"Akshay");
		testObject.method1(-22,"SK");*/
	}
}