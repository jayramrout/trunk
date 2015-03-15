package jrout.tutorial.hibernatecore;

import java.util.Date;

import jrout.tutorial.hibernatecore.user.DBUser;
import jrout.tutorial.hibernatecore.util.HibernateUtil;

import org.hibernate.Session;

public class AppSaveUpdate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(104);
		user.setUsername("superman1");
		user.setCreatedBy("system Engineer");
		user.setCreatedDate(new Date());
		/**
		 * Returns VOID
		 * Selects if row is there..if not then inserts...if there then updates
		 */
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		
		session.close();
	}
}//Next AppDelete