package jrout.tutorial.springbootjpa;

import jrout.tutorial.springbootjpa.dao.EmployeeRepository;
import jrout.tutorial.springbootjpa.model.Employee;
import jrout.tutorial.springbootjpa.model.Passport;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
//@Log4j
public class SpringBootJPAApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringBootJPAApplication.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Employees {}", employeeRepository.findById(1));

		Employee employee1 = new Employee("John", "Kelly", "Machine");
		Employee employee = employeeRepository.insert(employee1);

		logger.info("Employee Inserted {}", employee.getId());
		logger.info("Employee Inserted {}", employee);

		employee.setAddress("NY");
		employee = employeeRepository.update(employee);

		logger.info("Employee Inserted {}", employee.getId());
		logger.info("Employee Inserted {}", employee);

		employeeRepository.remove(1);
		logger.info("Employee Removed...");


		List<Employee> all = employeeRepository.findAll();
		logger.info("All employees With NamedQuery \n{}" , all);

		List<Employee> byFirstNameAndLastName = employeeRepository.findByFirstNameAndLastName("Aliko","Dangote");
		logger.info("Employees with NativeNamedQuery \n {}", byFirstNameAndLastName);

		List<Employee> byFirstNameAndAddress = employeeRepository.findByFirstNameAndAddressUsingCriteria("Folrunsho", "NC");
		logger.info("Employees with criteria \n {}", byFirstNameAndAddress);


		/**
		 * Mapping & Associations
		 */

		/*
			OneToOne
		 */
		employee = employeeRepository.findById(101);
		logger.info("Employee Details \n {}", employee);

		employeeRepository.saveEmployeeWithPassport();
	}
}