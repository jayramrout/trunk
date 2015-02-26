package com.tutorial.spring.orm_03._06BulkUpdate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class DemoClient
{
	private HibernateTemplate ht = null;
	
	

	public void setHt(HibernateTemplate ht) {
		System.out.println("setter of spring");
		this.ht = ht;
	}



	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringHibernate.xml");
		
		BeanFactory factory = (BeanFactory)ctx;
		
		DemoClient d = (DemoClient)factory.getBean("d1");

		String qry = "update User set role = ? where role = ?";

		
		int res = d.ht.bulkUpdate(qry, new Object[]{"PM", "SSE"});

		System.out.println("No. of records updated are: "+res);

	}


	
}
