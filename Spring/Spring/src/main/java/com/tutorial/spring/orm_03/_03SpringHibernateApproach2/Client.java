package com.tutorial.spring.orm_03._03SpringHibernateApproach2;

import java.util.Iterator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/orm_03/_03SpringHibernateApproach2/SpringHibernate.xml");
		BeanFactory factory = (BeanFactory)ctx;
		DemoInter d = (DemoInter)factory.getBean("d1");
		Iterator i1 = d.getData();
		while(i1.hasNext()) {
			User u1 = (User)i1.next();
			System.out.println(u1.getUid()+" "+u1.getUname()+" "+u1.getRole());
		}
	}
}