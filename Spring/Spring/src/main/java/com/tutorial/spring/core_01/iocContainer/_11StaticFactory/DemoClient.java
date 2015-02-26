package com.tutorial.spring.core_01.iocContainer._11StaticFactory;

import java.util.Calendar;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource(
				"com/tutorial/spring/core_01/iocContainer/_11StaticFactory/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Calendar calendar = factory.getBean("cal", Calendar.class);
		System.out.println("DemoClient.main()"+ calendar);
	}
}