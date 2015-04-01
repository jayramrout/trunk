package com.tutorial.spring.core_01.applicationContextContainer._01FirstApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {
	public static void main(String args[]) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/core_01/applicationContextContainer/_01FirstApplicationContext/spring.cfg.xml");

		DemoInter d1 = (DemoInter) ctx.getBean("demo");

		DemoInterImpl d2 = (DemoInterImpl) ctx.getBean("demo");

		System.out.println(d2.wish("friends"));

		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());

		ctx.close();
	}
}