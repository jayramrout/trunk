package jrout.tutorial.hibernate;

import java.util.Iterator;
import java.util.List;

import jrout.tutorial.hibernate.model.Employees;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HibernateQueryLanguageTest {
	private Session session = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    
	    SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
	    session = factory.openSession();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String hql = "FROM Employees E ";
		
		List<Employees> list = session.createQuery(hql).list();
		System.out.println(list);
		
		/*Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
        	Employees obj = (Employees)iterator.next();
        	
        	System.out.println(obj);
        	//        	Employees employee = (Employees) iterator.next();
//        	System.out.println(employee.getEmail());
        }*/	
            
//		fail("Not yet implemented");
	}

}
