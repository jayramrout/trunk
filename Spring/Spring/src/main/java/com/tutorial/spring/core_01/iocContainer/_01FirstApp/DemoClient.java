package com.tutorial.spring.core_01.iocContainer._01FirstApp;

import org.springframework.core.io.Resource;

import org.springframework.core.io.ClassPathResource;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class DemoClient {
	public static void main(String args[]) {

		Resource res = new ClassPathResource(
				"com/tutorial/spring/core_01/iocContainer/_01FirstApp/spring.cfg.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		DemoInter d = (DemoInter) factory.getBean("demo");
		System.out.println(d.wish("Jayram"));
	}
}