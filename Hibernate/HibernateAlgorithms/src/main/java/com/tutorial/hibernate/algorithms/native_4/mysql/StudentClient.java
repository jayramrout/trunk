package com.tutorial.hibernate.algorithms.native_4.mysql;

// insertion of a record into student table


import org.hibernate.cfg.*;
import org.hibernate.*;

class StudentClient 
{
	public static void main(String[] args) 
	{
		//activate hibernate software

		Configuration cfg = new Configuration();


		//read configuration file

		cfg  = cfg.configure("hibernate.mysql.cfg.xml");

		// create SessionFactory 

		SessionFactory factory = cfg.buildSessionFactory();

		//getting session from session factory

		Session ses = factory.openSession();

		//creation of StudentBean class object

		StudentBean st1 = new StudentBean();

	
		String name = "Roma";
		float tot_m = 500;

		//st1.setSid(sid);
		st1.setSname(name);
		st1.setTot_m(tot_m);



		//creation of Transaction object as we are modifying database table

		Transaction tx = ses.beginTransaction();

		ses.persist(st1);
		
		tx.commit();

		ses.close();

		System.out.println("Record Inserted!");

		factory.close();

	}
}
	