package com.excel.compositePK4;

//CustomerClientLoad.java

import org.hibernate.*;
import org.hibernate.cfg.*;


public class CustomerClientLoad {

	public static void main(String []args)
	{
		Configuration cfg = new Configuration();
		cfg = cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		CompKey k = new CompKey(1, 4);
		CustomerBean cb = new CustomerBean();
		cb.setKey(k);
		
		session.load(cb,k);
		System.out.println("Customer Transaction amount is: ");
		System.out.println(cb.getAmount());
		
		session.close();
		factory.close();
	}
}
