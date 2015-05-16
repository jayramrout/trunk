package com.tutorial.hibernate.cache.level2.eh_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.cache.domain.StudentBean;

class StudentClient 
{
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg  = cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session ses1 = factory.openSession();
		Session ses2 = factory.openSession();
		Session ses3 = factory.openSession();
		Session ses4 = factory.openSession();
		
		StudentBean studentBean;
		int studentId = 123;
		try {
			studentBean = (StudentBean) ses1.get(StudentBean.class, new Integer(studentId));
			System.out.println(" 1 ==> "+studentBean.getSid()+" "+studentBean.getSname()+" "+studentBean.getTot_m());
			Thread.sleep(3000);
			
			studentBean = (StudentBean) ses2.get(StudentBean.class, new Integer(studentId));
			System.out.println(" 2 ==> "+studentBean.getSid()+" "+studentBean.getSname()+" "+studentBean.getTot_m());
			Thread.sleep(3000);
			
			studentBean = (StudentBean) ses3.get(StudentBean.class, new Integer(studentId));
			System.out.println(" 3 ==> "+studentBean.getSid()+" "+studentBean.getSname()+" "+studentBean.getTot_m());
			Thread.sleep(3000);
			
			studentBean = (StudentBean) ses4.get(StudentBean.class, new Integer(studentId));
			System.out.println(" 4 ==> "+studentBean.getSid()+" "+studentBean.getSname()+" "+studentBean.getTot_m());
		} catch (Exception e) {
			System.err.println("StudentId : "+studentId +" might not be present in database .. \nPlease use correct Primary Key");
			e.printStackTrace();
		}finally {
			ses1.close();	
			ses2.close();
			ses3.close();
			ses4.close();
			factory.close();	
		}
	}
}