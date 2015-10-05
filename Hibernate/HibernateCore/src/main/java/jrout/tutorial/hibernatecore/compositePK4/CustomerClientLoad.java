package jrout.tutorial.hibernatecore.compositePK4;

//CustomerClientLoad.java

import org.hibernate.*;
import org.hibernate.cfg.*;

public class CustomerClientLoad {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		CustomerBean customerBean = new CustomerBean();
		session.load(customerBean, new CompositeKey(1, 7));

		System.out.println("Customer Transaction amount is: ");
		System.out.println(customerBean.getAmount());

		session.close();
		factory.close();
	}
}
