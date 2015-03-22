package com.tutorial.hibernate.cache.level1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.cfg.Configuration;

class StudentClient 
{
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg  = cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Use StatelessSession if you do not use evict 
//		StatelessSession ses1 = factory.openStatelessSession();
		
		Session ses1 = factory.openSession();
		StudentBean st1= new StudentBean();
		
//		ses1.beginTransaction();
		//creation of StudentBean class object
//		st1.setSid(105);
//		st1.setSname("Jag");
//		st1.setTot_m(23f);
//		ses1.save(st1);
//		ses1.getTransaction().commit();
		
		st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(105)); 
		System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getTot_m());
		try{
			Thread.sleep(2000);
		}catch(Exception exp0){}
		
		/**
		 * When ever we need to remove any persistent state object explicitly from our level 1 cache then
		 * we can call evict(_) method belongs to session object
		*/
//		ses1.evict(st1);
		st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(105));
		System.out.println("Record Values r: ");
		System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getTot_m());
		
		ses1.close();	
		factory.close();
	}
}
