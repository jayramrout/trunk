package jrout.tutorial.hibernate;

import static org.junit.Assert.assertNotNull;
import jrout.tutorial.hibernate.dao.EmployeesDAO;
import jrout.tutorial.hibernate.model.Employees;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

public class HibernateTest {

	EmployeesDAO employeeDao = null;
	Session session = null;

	@Before
	public void setUp() throws Exception {
		employeeDao = new EmployeesDAO();
		
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		/*
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		session = factory.openSession();
		*/
	}
	@Test
	public void testFindById() {
		Employees emp = employeeDao.findById(100);
		assertNotNull(emp);
	}
}
