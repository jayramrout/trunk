package jrout.tutorial.hibernatecore.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	/**
	 * SessionFactory:
		· It’s an object of a class that implements org.hibernate.SessionFactory interface.
		· It represents connection pool.
		· Using this we can get session objects.
		· Its a thread safe object.
	 */
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			//return new Configuration().configure().buildSessionFactory(); // Here it takes hibernate.cfg.xml file as the default file
			// If u have ur own config file then pass it on to configure(..) method
			
			Configuration configuration = new Configuration();
		    configuration.configure();
		    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
		            configuration.getProperties()). buildServiceRegistry();
		    return configuration.buildSessionFactory(serviceRegistry);
		    
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}

}