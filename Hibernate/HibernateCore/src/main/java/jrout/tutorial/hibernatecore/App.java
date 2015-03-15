package jrout.tutorial.hibernatecore;

import java.util.Date;

import jrout.tutorial.hibernatecore.user.DBUser;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App {
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    return sessionFactory;
	}
	
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
		
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		sessionFactory = createSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		/*Transient State Started
		Transient state:
			a. Object is created by programmer with data. But it doesn’t represent any table row.
			b. This object doesn’t contain primary key value.
			c. The object which is created for POJO class and which is not under control of hibernate
			application resides in transient state.
		*/
		DBUser user = new DBUser();
		user.setUserId(350);
		user.setUsername("Jayram");
		user.setCreatedBy("Tutor");
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