package com.tutorial.spring.core_01.applicationContextContainer._04PropertiesFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/core_01/applicationContextContainer/_04PropertiesFile/applicationContext.xml");
		DemoBean d = (DemoBean) ctx.getBean("db");
		System.out.println(d.hi());
	}
}