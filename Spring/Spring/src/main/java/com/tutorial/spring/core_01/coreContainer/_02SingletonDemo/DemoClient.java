package com.tutorial.spring.core_01.coreContainer._02SingletonDemo;

import org.springframework.core.io.Resource;

import org.springframework.core.io.ClassPathResource;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class DemoClient {
	public static void main(String args[]) {

		Resource res = new ClassPathResource(
				"com\\tutorial\\spring\\core_01\\coreContainer\\_02SingletonDemo\\Demo.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		DemoInter d1 = (DemoInterImpl) factory.getBean("demo");

		System.out.println(d1.wish("friends"));

		DemoInter d2 = (DemoInter) factory.getBean("demo");

		System.out.println(d2.wish("Friends"));
		// d2.hi();

		DemoInterImpl d3 = (DemoInterImpl) factory.getBean("demo");

		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());

	}
}
