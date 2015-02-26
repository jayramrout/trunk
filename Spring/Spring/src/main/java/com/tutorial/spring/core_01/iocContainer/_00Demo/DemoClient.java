package com.tutorial.spring.core_01.iocContainer._00Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Jayram
 *
 */
public class DemoClient {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Resource res = new ClassPathResource(
				"com/tutorial/spring/core_01/iocContainer/_00Demo/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		/*
		 * Company comp = (Company) factory.getBean("company");
		 * 
		 * System.out.println(comp.logoName());
		 */
		/*Company comp0 = (Company) factory.getBean("company");
		Company comp1 = (Company) factory.getBean("company");
		Company comp2 = (Company) factory.getBean("company");

		System.out.println(comp0.hashCode());
		System.out.println(comp1.hashCode());
		System.out.println(comp2.hashCode());*/
	}
}