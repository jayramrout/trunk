package com.tutorial.spring.core_01.applicationContextContainer._11XmlInit;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class DemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/tutorial/core_01/applicationContextContainer/_11XmlInit/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		Init i1 = (Init) factory.getBean("in");
		
		i1 = (Init) factory.getBean("in");
		
//		System.out.print(i1);		
	}

}
