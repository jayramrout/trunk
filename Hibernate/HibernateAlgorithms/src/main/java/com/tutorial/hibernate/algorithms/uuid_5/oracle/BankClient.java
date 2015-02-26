package com.tutorial.hibernate.algorithms.uuid_5.oracle;

// insertion of a record into student table


import org.hibernate.cfg.*;
import org.hibernate.*;

class BankClient 
{
	public static void main(String[] args) 
	{
		//activate hibernate software

		Configuration cfg = new Configuration();


		//read configuration file

		cfg  = cfg.configure("hibernate.oracle.cfg.xml");

		// create SessionFactory 

		SessionFactory factory = cfg.buildSessionFactory();

		//getting session from session factory

		Session ses = factory.openSession();

		//creation of Bank class object

		Bank b = new Bank();

	
		String name;
		
	
		name = "SBI";
		

		//b.setSid(sid);
		b.setName(name);
		



		//creation of Transaction object as we are modifying database table

		Transaction tx = ses.beginTransaction();

		ses.persist(b);
		
		tx.commit();

		ses.close();

		System.out.println("Record Inserted!");

		factory.close();

	}
}
