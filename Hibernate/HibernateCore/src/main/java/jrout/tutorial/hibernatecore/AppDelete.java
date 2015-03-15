package jrout.tutorial.hibernatecore;

import jrout.tutorial.hibernatecore.user.DBUser;
import jrout.tutorial.hibernatecore.util.HibernateUtil;

import org.hibernate.Session;

public class AppDelete {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(222);
		/**
		 * Returns VOID
		 * Selects if row is there..if there then deletes...else ignores
		 */
		session.delete(user);
		session.getTransaction().commit();
		
		session.close();
	}
}//Next AppGet