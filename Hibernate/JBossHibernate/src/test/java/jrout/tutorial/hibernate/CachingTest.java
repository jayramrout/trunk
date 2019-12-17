package jrout.tutorial.hibernate;

import jrout.tutorial.hibernate.dao.CountriesRepository;
import jrout.tutorial.hibernate.dao.EmployeesRepository;
import jrout.tutorial.hibernate.model.Countries;
import jrout.tutorial.hibernate.model.Employees;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CachingTest {

	@Autowired
	EmployeesRepository employeesRepository = null;

	@Autowired
	CountriesRepository countriesRepository;

	@Autowired
	EntityManager entityManager;

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Here the query will be call two times as we are
	 * not using @Transactional annotation
	 * @throws Exception
	 */
	@Test
	public void findEmployee() throws Exception {
		employeesRepository.findById(100);
		employeesRepository.findById(100);
	}

	/**
	 * Here the query will be call One times as we are
	 * using @Transactional annotation
	 * @throws Exception
	 */
	@Test
	@Transactional
	public void findEmployeeWithTransaction() throws Exception {
		employeesRepository.findById(100);
		employeesRepository.findById(100);
		employeesRepository.findById(100);
	}


	/**
	 * Using evict
	 * @throws Exception
	 */
	@Test
	@Transactional
	public void findEmployeeWithEvict() throws Exception {
		Session session = entityManager.unwrap(Session.class);
		Employees employees = employeesRepository.findById(100).get();
		employeesRepository.findById(100);
		session.evict(employees);
		employeesRepository.findById(100);
	}

	/**
	 * Add Maven Dependency
	 * Enable Cache for the application
	 * Create ehcache.xml
	 * Make entities Cacheable
	 * Testing it....
	 * @throws Exception
	 */
	@Test
	@Transactional
	public void findCountriesWithSecondLevel() throws Exception {
		Session session = entityManager.unwrap(Session.class);
		Countries countries = countriesRepository.findById("AR").get();

		System.out.println(countries.getCountryName());
		session.evict(countries);

		countries = countriesRepository.findById("AR").get();
		System.out.println(countries.getCountryName());

	}

}
