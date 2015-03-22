package com.tutorial.hibernate.algorithms.identity_mysql_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.algorithms.domain.StudentBean;

class StudentClient {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg  = cfg.configure("hibernate.mysql.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		StudentBean st1 = new StudentBean();

		String name ="Jayram";
		float tot_m = 100;

		//st1.setSid(sid);
		st1.setSname(name);
		st1.setTot_m(tot_m);

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