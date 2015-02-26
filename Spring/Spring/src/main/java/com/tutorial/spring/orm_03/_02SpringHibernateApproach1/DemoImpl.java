package com.tutorial.spring.orm_03._02SpringHibernateApproach1;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class DemoImpl implements DemoInter{

	private SessionFactory factory = null;
	
	
	public void setFactory(SessionFactory factory) {
		System.out.println("Setter of spring class");
		this.factory = factory;
	}

	public Iterator getData() throws Exception {
		System.out.println("In spring class getData()");
		Session  ses = factory.openSession();
		Query query = ses.createQuery("from DBUser");
		Iterator i1 = query.iterate();
		//ses.close();
		return i1;
	}

	
}
