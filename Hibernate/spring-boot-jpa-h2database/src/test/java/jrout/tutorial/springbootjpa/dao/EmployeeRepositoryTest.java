package jrout.tutorial.springbootjpa.dao;

import jrout.tutorial.springbootjpa.SpringBootJPAApplication;
import jrout.tutorial.springbootjpa.model.Certificate;
import jrout.tutorial.springbootjpa.model.Employee;
import jrout.tutorial.springbootjpa.model.Passport;
import jrout.tutorial.springbootjpa.model.Salary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJPAApplication.class)
class EmployeeRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(EmployeeRepositoryTest.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @PersistenceContext
    EntityManager entityManager;

    @BeforeEach
    void setUp() {
    }

    @Test
    @Transactional // PersistenceContext
    void findById() {
        Employee byId = employeeRepository.findById(101);
        logger.info("Employees {}", byId.getFirstName());
        // Lazy loading happens here..check the logs for two separate select query.
//        logger.info("Passport {}", byId.getPassport());
    }

    /**
     * Uni-directional relationship
     */
    @Test
    @Transactional // PersistenceContext
    @DirtiesContext //
    /**
     * This is used to retain the intial state of your db while testing.
     * if two Unit test are dependent of the data which is been set and one of the unit
     * test is changing the data , then it may cause problems.
     * In-order to retain the initial state of the db, we use DirtiesContext.
     *
     */
    void findPassportById() {
        /*Passport byId = employeeRepository.findPassportById(601);
        logger.info("PassPort number {}", byId.getNumber());
        // Lazy loading happens here..check the logs for two separate select query.
        logger.info("Employee {}", byId.getEmployee().getFirstName());*/
    }


    @Test
    void insert() {

        Employee employee1 = new Employee("John", "Kelly", "Machine Street");
        Employee employee = employeeRepository.insert(employee1);

        logger.info("Employee Inserted {}", employee.getId());
        assertEquals("John",employee.getFirstName());
    }

    @Test
    void update() {
    }

    @Test
    void remove() {
    }

    @Test
    void findAll() {
        List<Employee> all = employeeRepository.findAll();
        logger.info("All employees With NamedQuery \n{}" , all);
    }

    @Test
    void findByFirstNameAndLastName() {
        List<Employee> byFirstNameAndLastName = employeeRepository.findByFirstNameAndLastName("Aliko","Dangote");
        logger.info("Employees with NativeNamedQuery \n {}", byFirstNameAndLastName);

    }

    @Test
    void findByFirstNameAndAddressUsingCriteria() {
        List<Employee> byFirstNameAndAddress = employeeRepository.findByFirstNameAndAddressUsingCriteria("Folrunsho", "NC");
        logger.info("Employees with criteria \n {}", byFirstNameAndAddress);
    }


    @Test
//    @Transactional
    void moreOnEntityMananger(){
        Employee employee = new Employee("Dan", "Pushman");
        entityManager.persist(employee);
        logger.info("Employee Id : "+ employee.getId());
        logger.info("Employee Id : "+ employee.getId());

        employee.setAddress("WildStreet");
        entityManager.flush();

        // detach is used to detach the object from transaction.
        // even we flush it it will not update in the db.
        //entityManager.detach(employee);

        // clear will ditached all the objects from transaction.
        //entityManager.clear();


        // will refresh the latest state of the object
//        entityManager.refresh(employee);

        logger.info("Employee Id : "+ employee.getAddress());

    }

    @Test
    public void findPassportOfEmployee(){
        Employee employee = entityManager.find(Employee.class, 101);
        logger.info("Employee Name "+ employee.getFirstName());
    }

    @Test
    @Transactional
    public void findEmployee(){
        Employee employee = employeeRepository.findById(101);
        logger.info("Employe Info : {}", employee.getFirstName());
        logger.info("Employee Passport {}", employee.getPassport().getNumber());

        logger.info("Employee Salries {}", employee.getSalaries());
    }

    @Test
    @Transactional
    public void findSalary(){
        Salary salary = employeeRepository.findBySalaryId(701);
       logger.info("Salary {} "+ salary);
       logger.info("Employee {} "+ salary.getEmployee());
    }


    @Test
    @Transactional
    public void fetchEmployeeTest(){
        Employee employee = employeeRepository.findById(102);
        assertNotNull(employee);
        logger.info("Employee \n {}",employee);
        logger.info("All Certificates \n {}",employee.getCertificates());
    }


    @Test
    @Transactional
    public void insertEmployeeAndCertificate(){
        Certificate certificate = entityManager.find(Certificate.class, 801);
        Employee employee = entityManager.find(Employee.class, 102);
        employee.addCertificate(certificate);

        entityManager.persist(employee);

        logger.info("Employee {}" , employee);
        entityManager.flush(); // commit it explicitly.// you don't need it actually

        employee = entityManager.find(Employee.class, 102);
        logger.info("Certifcates {}" , employee.getCertificates());
    }



    @Test
    @Transactional
    public void fetchCertificateCache(){
        Certificate certificate = entityManager.find(Certificate.class, 801);
        logger.info("Certificate name {}", certificate.getName());

        certificate = entityManager.find(Certificate.class, 801);
        logger.info("Certificate name {}", certificate.getName());
    }




}