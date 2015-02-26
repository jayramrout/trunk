package com.tutorial.spring.core_01.iocContainer._09ConstructorInjection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathResource res = new ClassPathResource(
				"com/tutorial/spring/core_01/iocContainer/_09ConstructorInjection/applicationContext.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);

		Bean d1 = (Bean) factory.getBean("be");

		System.out.print(d1);
	}
}
