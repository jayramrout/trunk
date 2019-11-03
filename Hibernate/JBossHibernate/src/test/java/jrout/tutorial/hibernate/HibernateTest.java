package jrout.tutorial.hibernate;

import jrout.tutorial.hibernate.dao.EmployeesRepository;
import jrout.tutorial.hibernate.model.Departments;
import jrout.tutorial.hibernate.model.Employees;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StreamUtils;

import javax.persistence.EntityManager;
import java.util.Set;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateTest {

	@Autowired
	EmployeesRepository employeesRepository = null;

	@Autowired
	EntityManager em;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Transactional
	public void testFindById() {
		Employees emp = employeesRepository.findById(Integer.valueOf(102)).get();
		assertNotNull(emp);
		System.out.println(emp.getFirstName());
//		System.out.println(emp.getDepartments().getDepartmentName());
	}


	@Test
	@Transactional
	public void testFindManagerDetails() {
		Employees emp = employeesRepository.findById(Integer.valueOf(116)).get();
		assertNotNull(emp);
		System.out.println(emp.getFirstName());
		System.out.println("Manager Details is : ");
		System.out.println(emp.getEmployees().getFirstName());
	}


	@Test
	@Transactional
	public void testGetDepartmentses() {
		Employees emp = employeesRepository.findById(Integer.valueOf(100)).get();
		assertNotNull(emp);
		System.out.println(emp.getFirstName());

		Set<Departments> departmentses = emp.getDepartmentses();
		for(Departments departments : departmentses){
			System.out.println(departments.getDepartmentId() +" "+ departments.getDepartmentName());
			System.out.println(departments.getEmployees().getFirstName());
		}
	}


	@Test
	@Transactional
	public void testGetEmployees() {
		Employees emp = employeesRepository.findById(Integer.valueOf(100)).get();
		System.out.println(emp.getEmployeeses().size());
	}


	@Test
	@Transactional
	public void testCriteria() {
		Iterable<Employees> all = employeesRepository.findAll();


	}


}
