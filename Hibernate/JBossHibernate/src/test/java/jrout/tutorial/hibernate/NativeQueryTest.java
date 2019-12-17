package jrout.tutorial.hibernate;

import jrout.tutorial.hibernate.dao.EmployeesRepository;
import jrout.tutorial.hibernate.model.Employees;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class NativeQueryTest {

	@Autowired
	private EntityManager em;

	@Autowired
	private EmployeesRepository employeesRepository;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void findEmployee() throws Exception {
		employeesRepository.findAll();

	}

	@Test
	public void all_employees() {
		Query nativeQuery = em.createNativeQuery("SELECT * FROM EMPLOYEES", Employees.class);
		List resultList1 = nativeQuery.getResultList();
		for(int i=0; i < resultList1.size(); i++){
			Employees employees = (Employees) resultList1.get(i);
			System.out.println(employees.getFirstName() +"  " + employees.getLastName());
		}
	}

	@Test
	public void all_employees_having() {
		Query nativeQuery = em.createNativeQuery("SELECT * FROM EMPLOYEES WHERE LAST_NAME like 'Jo%'", Employees.class);
		List resultList1 = nativeQuery.getResultList();
		for(int i=0; i < resultList1.size(); i++){
			Employees employees = (Employees) resultList1.get(i);
			System.out.println(employees.getFirstName() +"  " + employees.getLastName());
		}
	}

	@Test
	public void all_employees_with_parameters() {
		Query nativeQuery = em.createNativeQuery("SELECT * FROM EMPLOYEES WHERE LAST_NAME = ?", Employees.class);
		nativeQuery.setParameter(1,"Jones");
		List resultList1 = nativeQuery.getResultList();
		for(int i=0; i < resultList1.size(); i++){
			Employees employees = (Employees) resultList1.get(i);
			System.out.println(employees.getFirstName() +"  " + employees.getLastName());
		}
	}

	@Test
	public void all_employees_with_named_parameters() {
		Query nativeQuery = em.createNativeQuery("SELECT * FROM EMPLOYEES WHERE FIRST_NAME = :fname and LAST_NAME = :lname", Employees.class);
		nativeQuery.setParameter("fname","Vance");
		nativeQuery.setParameter("lname","Jones");

		List resultList1 = nativeQuery.getResultList();
		for(int i=0; i < resultList1.size(); i++){
			Employees employees = (Employees) resultList1.get(i);
			System.out.println(employees.getFirstName() +"  " + employees.getLastName());
		}
	}


	@Test
	@Transactional
	public void join() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employees> cq = cb.createQuery(Employees.class);
		Root<Employees> employeesRoot = cq.from(Employees.class);
		// select * from employees

//		Join<Object, Object> join = employeesRoot.join("departments", JoinType.INNER);

		TypedQuery<Employees> query = em.createQuery(cq.select(employeesRoot));
		List<Employees> resultList = query.getResultList();

		for (Employees employees : resultList) {
			System.out.println(employees.getFirstName() +"  " + employees.getLastName() +"  "+ employees.getDepartments().getDepartmentName());
		}
	}
}
