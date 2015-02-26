package com.tutorial.spring.core_01.applicationContextContainer._02Prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class   DemoClient
{
	public static void main(String args[])
	{

		/*	Resource  res=new ClassPathResource("applicationContext.xml");
		BeanFactory  factory=new XmlBeanFactory(res);*/

		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/core_01/applicationContextContainer/_02Prototype/applicationContext.xml");

		DemoInter d1=(DemoInter)ctx.getBean("demo");
		DemoInterImpl d3=(DemoInterImpl)ctx.getBean("demo");
		DemoInter d2=(DemoInter)ctx.getBean("demo");

		System.out.println(d1.wish("Sai"));
		System.out.println(d2.wish("Kanakadhar"));

		d1 = d2 = d3 = null;
		ctx.close();

	}
}