package com.tutorial.hibernate.algorithms.identity_mysql_1;

// insertion of a record into student table


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

		String name ="Jayram";
		float tot_m = 100;

		//st1.setSid(sid);
		st1.setSname(name);
		st1.setTot_m(tot_m);

		//creation of Transaction object as we are modifying database table
		Transaction tx = ses.beginTransaction();
//		Integer idVal = (Integer) ses.save(st1);
//		System.out.println("Id value is: "+idVal.intValue());
		ses.persist(st1);
		System.out.println("Id value is: "+st1.getSid());
		tx.commit();
		ses.close();
		System.out.println("Record Inserted!");
		factory.close();
	}
}
