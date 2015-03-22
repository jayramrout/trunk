package com.tutorial.hibernate.cache.level2.eh_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class StudentClient 
{
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg  = cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session ses1 = factory.openSession();
		Session ses2 = factory.openSession();
		Session ses3 = factory.openSession();
		Session ses4 = factory.openSession();
		
		StudentBean st1, st2;

		st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(100));
		System.out.println("ONE");
		Thread.sleep(3000);
		
		st2 = (StudentBean) ses2.get(StudentBean.class, new Integer(100));
		System.out.println("TWO");
		Thread.sleep(3000);
		
		st2 = (StudentBean) ses3.get(StudentBean.class, new Integer(100));
		System.out.println("THREE");
		Thread.sleep(3000);
		
		st2 = (StudentBean) ses4.get(StudentBean.class, new Integer(100));
		System.out.println("FOUR");
		
		System.out.println("Record Values r: ");
		ses1.close();	
		ses2.close();
		System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getTot_m());
		System.out.println(st2.getSid()+" "+st2.getSname()+" "+st2.getTot_m());
		/*
		ses = factory.openSession();
		st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(105));
*/
		factory.close();

	}
}
