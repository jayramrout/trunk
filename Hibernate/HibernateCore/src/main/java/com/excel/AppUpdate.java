package com.excel;

import java.util.Date;

import org.hibernate.Session;

import com.excel.user.DBUser;
import com.excel.util.HibernateUtil;

public class AppUpdate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(101);
		user.setUsername("superman");
		user.setCreatedBy("net Eng");
		user.setCreatedDate(new Date());
		/**
		 * It updates. If row does not exists..then it throws Exception
		 */
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}
}//Next AppMerge