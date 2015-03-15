package jrout.tutorial.hibernatecore;

import java.util.Date;

import jrout.tutorial.hibernatecore.user.DBUser;
import jrout.tutorial.hibernatecore.util.HibernateUtil;

import org.hibernate.Session;

public class AppUpdate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(20);
		user.setUsername("Siva");
		user.setCreatedBy("net Eng");
//		user.setCreatedDate(new Date());
		/**
		 * It updates. If row does not exists..then it throws Exception
		 */
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}
}//Next AppMerge