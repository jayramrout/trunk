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

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CriteriaTest {

	@Autowired
	EmployeesRepository employeesRepository = null;

	@Autowired
	EntityManager em;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void all_employees() {
		/*Iterable<Employees> allEmployees = employeesRepository.findAll();
		for (Employees employees : allEmployees) {
			System.out.println(employees.getFirstName() +"  " + employees.getLastName());
		}*/

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employees> cq = cb.createQuery(Employees.class);
		Root<Employees> employeesRoot = cq.from(Employees.class);

		TypedQuery<Employees> query = em.createQuery(cq.select(employeesRoot));
		List<Employees> resultList = query.getResultList();

		for (Employees employees : resultList) {
			System.out.println(employees.getFirstName() +"  " + employees.getLastName());
		}
	}


	@Test
	public void all_employees_having() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employees> cq = cb.createQuery(Employees.class);
		Root<Employees> employeesRoot = cq.from(Employees.class);

		Predicate lastName = cb.like(employeesRoot.get("lastName"), "Jo%");
		cq.where(lastName);

		TypedQuery<Employees> query = em.createQuery(cq.select(employeesRoot));
		List<Employees> resultList = query.getResultList();

		for (Employees employees : resultList) {
			System.out.println(employees.getFirstName() +"  " + employees.getLastName());
		}
	}


	@Test
	@Transactional
	public void join() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employees> cq = cb.createQuery(Employees.class);
		Root<Employees> employeesRoot = cq.from(Employees.class);

		Join<Object, Object> join = employeesRoot.join("departments", JoinType.INNER);

		TypedQuery<Employees> query = em.createQuery(cq.select(employeesRoot));
		List<Employees> resultList = query.getResultList();

		for (Employees employees : resultList) {
			System.out.println(employees.getFirstName() +"  " + employees.getLastName() +"  "+ employees.getDepartments().getDepartmentName());
		}
	}
}
