package jrout.tutorial.hibernate;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import jrout.tutorial.hibernate.dao.EmployeesDAO;
import jrout.tutorial.hibernate.model.Departments;
import jrout.tutorial.hibernate.model.Employees;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private static final Log log = LogFactory.getLog(EmployeeTest.class);
	
	EmployeesDAO employeeDao = null;
	Session session = null;
	@Before
	public void setUp() throws Exception {
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		/*Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
	    
		session = factory.openSession();*/
		
		employeeDao = new EmployeesDAO();
	}

//	@Test
	public void testPersist() {
		fail("Not yet implemented");
	}

//	@Test
	public void testAttachClean() {
		fail("Not yet implemented");
	}

//	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

//	@Test
	public void testMerge() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		Employees emp = employeeDao.findById(100);
		
//		Employees emp = (Employees)session.get(Employees.class, 100);
//		System.out.println(emp.getEmail());
		
		log.info("Employee Name" + emp.getFirstName());
		
		Departments dept = emp.getDepartments();
		log.info("Department Name : "+dept.getDepartmentName());
		
		assertNotNull(emp);
	}

//	@Test
	public void testFindByExample() {
		fail("Not yet implemented");
	}

}
