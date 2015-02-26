package com.excel;

import java.util.Date;

import org.hibernate.Session;

import com.excel.user.DBUser;
import com.excel.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		/**
		 * Session:
			· Each session object of SessionFactory pool is constructed by encapsulating JDBC connection
			and statement objects.
			· Programmer uses Session object to interact with database software.
			· Session object is not a thread safe object.
			· Java Hibernate application can have multiple Hibernate Session objects.
			Hibernate Session object is an object of a class which implements org.Hibernate.Session
			interface.
			
			Note: Session objects of SessionFactory pool will be constructed based on Hibernate configuration
			file.
		 */
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		/*Transient State Started
		Transient state:
			a. Object is created by programmer with data. But it doesn’t represent any table row.
			b. This object doesn’t contain primary key value.
			c. The object which is created for POJO class and which is not under control of hibernate
			application resides in transient state.
		*/
		DBUser user = new DBUser();
		user.setUserId(111);
		user.setUsername("110 man");
		user.setCreatedBy("system Engineer");
		user.setCreatedDate(new Date());
		/*Transient State Started*/
		
		/*Persistance State Started
		 * Persistent state:
			a. The object that represents table row with primary key and managed under the control of
			hibernate software is called as persistent object.
			b. This object will be in synchronization with table row.
			c. Hibernate application developer’s uses this kind of object in persistent logic
			development.
		 * */
		Integer i = (Integer)session.save(user);
		System.out.println("App.main() 1 =" + i);
		session.getTransaction().commit();
		/*Persistance State Ended*/
		/**
		 * Detached state Started
			a. When session is closed automatically persistent context will be destroyed and all the
			objects which are in persistent state will be thrown to detached state.
			b. When table row of persistence state object is deleted then object becomes detached
			object.
		 */
		session.close();
		/*Detached State Ended*/
		
	}
} // Next AppUpdate