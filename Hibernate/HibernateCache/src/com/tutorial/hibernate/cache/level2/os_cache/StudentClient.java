package com.tutorial.hibernate.cache.level2.os_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class StudentClient {
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg  = cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session ses1 = factory.openSession();
		Session ses2 = factory.openSession();

		StudentBean st1, st2;// = new StudentBean();
		st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(105));
		
		st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(105));
		
		Thread.sleep(5000);
		
		st2 = (StudentBean) ses2.get(StudentBean.class, new Integer(105));
		System.out.println("Record Values r: ");
		ses1.close();	
		ses2.close();
		System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getTot_m());
		System.out.println(st2.getSid()+" "+st2.getSname()+" "+st2.getTot_m());

		factory.close();
	}
}
