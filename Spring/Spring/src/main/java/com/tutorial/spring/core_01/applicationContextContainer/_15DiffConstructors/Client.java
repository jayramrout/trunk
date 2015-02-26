package com.tutorial.spring.core_01.applicationContextContainer._15DiffConstructors;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public final class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/core_01/applicationContextContainer/_15DiffConstructors/applicationContext.xml");
		Bean b1 = (Bean) ctx.getBean("one");
		Bean b2 = (Bean) ctx.getBean("two");
		System.out.println(b1);
		System.out.println(b2);
	}
}