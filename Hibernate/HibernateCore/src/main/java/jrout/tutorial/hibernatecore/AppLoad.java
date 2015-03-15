package jrout.tutorial.hibernatecore;

import jrout.tutorial.hibernatecore.user.DBUser;
import jrout.tutorial.hibernatecore.util.HibernateUtil;

import org.hibernate.Session;

public class AppLoad {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		/**
		 * Returns POJO Object
		 * Its lazy loading till we call the get methods.
		 * If no rows in db then it throws Exception : org.hibernate.ObjectNotFoundException
		 */
		DBUser obj = null;
		obj = (DBUser)session.load(DBUser.class,200);
//		System.out.println("AppGet.main() 1" + obj.getUsername());

		/**
		 * Returns Void
		 * its Early Loading
		 */
		obj = new DBUser();
		session.load(obj,200);
		
		System.out.println("AppGet.main() 2" + obj.getUserId());
		
		session.close();
	}
}