package com.tutorial.spring.core_01.iocContainer._00Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoClient3 {

	public static void main(String[] args) {
		Company comp = new CarCompany();
		System.out.println(comp.logoName());
		
		
		Company comp1 = new CarCompany();
		System.out.println(comp1.logoName());
		
		
		Company comp2 = new CarCompany();
		System.out.println(comp2.logoName());
	}
}