package com.excel;

import org.hibernate.Session;

import com.excel.user.DBUser;
import com.excel.util.HibernateUtil;

public class AppLoad {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		/**
		 * Returns POJO Object
		 * Its lazy loading till we call the get methods.
		 * If no rows in db then it throws Exception : org.hibernate.ObjectNotFoundException
		 */
		DBUser obj = null;
//		obj = (DBUser)session.load(DBUser.class,105);
//		System.out.println("AppGet.main() 1" + obj.getUsername());
		
		
		/**
		 * Returns Void
		 * its Early Loading
		 */
		obj = new DBUser();
		session.load(obj,101);
		System.out.println("AppGet.main() 2" + obj);
//		
		session.getTransaction().commit();
		
		session.close();
	}
}