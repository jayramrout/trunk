package com.tutorial.spring.core_01.applicationContextContainer._03InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;

public class DemoClient {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/core_01/applicationContextContainer/_03InterfaceInjection/applicationContext.xml");

		Demo d1 = (Demo) ctx.getBean("db");
		System.out.println(d1.hi());

		// DemoImpl d2=(DemoImpl)ctx.getBean("db");
		// System.out.println(d1.hi());
		// Date d2=(Date)ctx.getBean("dt");
		// System.out.println(d2);
	}
}