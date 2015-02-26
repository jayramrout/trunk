package com.tutorial.hibernate.mappings.component;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.pojo.JobType;
import com.tutorial.hibernate.pojo.Person;
import com.tutorial.hibernate.util.HibernateUtil;

public class InsertTest
{
	public static void main(String args[])
	{
		Session ses=null;
		try
		{
			
			Configuration cfg = new Configuration();
			//read configuration file
			cfg  = cfg.configure("hibernate.oracle.cfg.xml");
			// create SessionFactory 
			SessionFactory factory = cfg.buildSessionFactory();
			ses = factory.openSession();
			Transaction tx= ses.beginTransaction();
			Person p1= new Person();
			
			JobType jt1 = new JobType();
			jt1.setJob("Software Engineer");
			jt1.setSalary(50000);
			jt1.setDepartment(101);

			p1.setPname("Sobha");
			p1.setPjob(jt1);

			Person p2 = new Person();
			JobType jt2 = new JobType();
			jt2.setJob("SE");
			jt2.setSalary(25000);
			jt2.setDepartment(102);

			p2.setPname("Nikhil");
			p2.setPjob(jt2);

			ses.save(p1);
			ses.save(p2);

			tx.commit();
			System.out.println("records  are inserted successfully");
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		ses.close();
	}//main
}//class