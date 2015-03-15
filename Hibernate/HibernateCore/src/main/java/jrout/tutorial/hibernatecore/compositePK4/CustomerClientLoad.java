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
		CompositeKey compositeKey = new CompositeKey(1, 7);
		CustomerBean customerBean = new CustomerBean();
		customerBean.setKey(compositeKey);

		session.load(customerBean, compositeKey);
		System.out.println("Customer Transaction amount is: ");
		System.out.println(customerBean.getAmount());

		session.close();
		factory.close();
	}
}
