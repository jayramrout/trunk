package com.tutorial.hibernate.algorithms.uuid_5.oracle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.tutorial.hibernate.algorithms.domain.Bank;

class BankClient {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg  = cfg.configure("hibernate.oracle.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Bank b = new Bank();
		String name = "SBI";
		b.setName(name);
		Transaction tx = ses.beginTransaction();
		ses.persist(b);
		tx.commit();
		ses.close();
		System.out.println("Record Inserted!");
		factory.close();
	}
}