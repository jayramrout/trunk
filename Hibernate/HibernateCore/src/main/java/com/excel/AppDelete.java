package com.excel;

import java.util.Date;

import org.hibernate.Session;

import com.excel.user.DBUser;
import com.excel.util.HibernateUtil;

public class AppDelete {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(107);
		user.setUsername("superman");
		user.setCreatedBy("system Engineer");
		user.setCreatedDate(new Date());
		/**
		 * Returns VOID
		 * Selects if row is there..if there then deletes...else ignores
		 */
		session.delete(user);
		session.getTransaction().commit();
		
		session.close();
	}
}//Next AppGet