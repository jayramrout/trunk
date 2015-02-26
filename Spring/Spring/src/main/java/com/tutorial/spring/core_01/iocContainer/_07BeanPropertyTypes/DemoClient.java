package com.tutorial.spring.core_01.iocContainer._07BeanPropertyTypes;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class DemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res = new ClassPathResource("com/tutorial/spring/core_01/iocContainer/_07BeanPropertyTypes/spring.cfg.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		DemoImple d1 = (DemoImple) factory.getBean("db");
		System.out.print(d1.sayHello());		
	}
}