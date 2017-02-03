package jrout.tutorial.hibernatecore.compositePK4;

//CustomerClientSave.java

import org.hibernate.*;
import org.hibernate.cfg.*;


public class CustomerClientSave {
	
	public static void main(String []args)
	{
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		CompositeKey compositeKey = new CompositeKey(1, 8);
		
		CustomerBean customerBean = new CustomerBean();
		customerBean.setKey(compositeKey);		
		customerBean.setAmount(50000);
							
		session.save(customerBean);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
