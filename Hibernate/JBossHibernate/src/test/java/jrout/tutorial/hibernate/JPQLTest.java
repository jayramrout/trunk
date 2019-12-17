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
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;
/*
Java Persistence Query Language (JPQL)
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JPQLTest {

	@Autowired
	EntityManager em;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void all_employees() {
		TypedQuery<Employees> typedQuery = em.createNamedQuery("query_get_all_employees", Employees.class);
		List<Employees> resultList = typedQuery.getResultList();
		for(Employees employees : resultList){
			System.out.println(employees.getFirstName() +" "+ employees.getLastName());
		}
	}
}
