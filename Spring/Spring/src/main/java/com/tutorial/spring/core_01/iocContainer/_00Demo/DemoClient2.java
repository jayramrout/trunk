package com.tutorial.spring.core_01.iocContainer._00Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class DemoClient2 {

	public static void main(String[] args) {
//		Company company = new CarCompany();
		
		Resource res = new ClassPathResource(
				"com/tutorial/spring/core_01/iocContainer/_00Demo/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		factory.getBean("company");
		
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/iocContainer/_00Demo/applicationContext.xml");
	}
}