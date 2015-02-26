package com.tutorial.spring.orm_03._05SeparateConfigFiles_spring_hibernate;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class DemoClient {
	private HibernateTemplate ht = null;

	public void setHt(HibernateTemplate ht) {
		System.out.println("setter of spring");
		this.ht = ht;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.cfg.xml");

		BeanFactory factory = (BeanFactory) ctx;

		DemoClient d = (DemoClient) factory.getBean("d1");

		List l = d.ht.findByNamedQuery("selectUser", new Object[] { "%a%" });

		Iterator it = l.iterator();
		while (it.hasNext()) {
			User ob = (User) it.next();
			System.out.print(ob.getUid());
			System.out.println(" " + ob.getUname() + " " + ob.getRole());
			System.out.println("--------------");
		}

	}

}
