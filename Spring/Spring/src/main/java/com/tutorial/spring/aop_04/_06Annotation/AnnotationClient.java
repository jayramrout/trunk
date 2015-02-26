/**
 * 
 */
package com.tutorial.spring.aop_04._06Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.spring.aop_04._06Annotation.customer.Customer;

/**
 * @author Jayram
 *
 */
public class AnnotationClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-AOP-Annotation-Customer.xml");
		Customer impl = (Customer)ctx.getBean("customerBo");
		impl.addCustomer();
	}
}
