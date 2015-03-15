package jrout.tutorial.hibernatecore;

import java.util.Date;

import jrout.tutorial.hibernatecore.user.DBUser;
import jrout.tutorial.hibernatecore.util.HibernateUtil;

import org.hibernate.Session;

public class AppMerge {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(200);
		user.setUsername("Sundar");
		user.setCreatedBy("system Eng2");
		user.setCreatedDate(new Date());
		/**
		 * uses Select to check If row is present then it updates else it inserts
		 * It retruns the POJO Object
		 */
		DBUser obj = (DBUser)session.merge(user);
		System.out.println("AppMerge.main()" + obj.getUserId());
		session.getTransaction().commit();
		
		session.close();
	}
} // Next AppSaveUpdate