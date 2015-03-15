package jrout.tutorial.hibernatecore;

import jrout.tutorial.hibernatecore.user.DBUser;
import jrout.tutorial.hibernatecore.util.HibernateUtil;

import org.hibernate.Session;

public class AppGet {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		/**
		 * When you do a get you do not have to begin or commit the transation.
		 */
		/**
		 * Returns POJO Object
		 * Its early loading
		 * If no rows in db then it returns null
		 * Its Early loading.
		 */
		DBUser obj = (DBUser)session.get(DBUser.class,111);
//		System.out.println("AppGet.main()" + obj);
		session.close();
	}
}//Next AppLoad