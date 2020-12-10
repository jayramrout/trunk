package jrout.tutorial.springbootjpa.dao;

import jrout.tutorial.springbootjpa.model.Employee;
import jrout.tutorial.springbootjpa.model.Passport;
import jrout.tutorial.springbootjpa.model.Salary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class EmployeeRepository  {

    // CRUD Operations

    @PersistenceContext
    EntityManager entityManager;

    public Employee findById(int id){
        return entityManager.find(Employee.class, id);
    }

    public Salary findBySalaryId(int id){
        return entityManager.find(Salary.class, id);
    }

    public Passport findPassportById(int id){
        return entityManager.find(Passport.class, id);
    }

    public void saveEmployeeWithPassport(){
        Passport passport = new Passport("PASS-04");
        entityManager.persist(passport);
        Employee employee = new Employee("Tanu", "Mittal", "Boston");
        employee.setPassport(passport);
        entityManager.persist(employee);
    }


    public Employee insert(Employee employee){
        return entityManager.merge(employee);
    }

    public Employee update(Employee employee){
        return entityManager.merge(employee);
    }

    public void remove(int id){
        Employee byId = findById(id);
        if(byId != null)
            entityManager.remove(byId);
    }

    public List<Employee> findAll(){
        TypedQuery<Employee> find_all_employees = entityManager.createNamedQuery("Employee.findAllEmpoyee", Employee.class);
        return find_all_employees.getResultList();
    }

    public List<Employee> findByFirstNameAndLastName(String fname, String lname){
        Query namedQuery = entityManager.createNamedQuery("Employee.findByFirstNameAndLastName");
        namedQuery.setParameter(1,fname);
        namedQuery.setParameter(2,lname);

        List resultList = namedQuery.getResultList();

        return resultList;
    }

    public List<Employee> findByFirstNameAndAddressUsingCriteria(String fname, String address){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
        Root<Employee> employee = cq.from(Employee.class);

        // select * from employee where first_name = ? and address like '%address%'

        Predicate fnamePredicate = cb.equal(employee.get("firstName"), fname);
        Predicate addressPredicate = cb.like(employee.get("address"), "%" + address + "%");
        cq.where(fnamePredicate, addressPredicate);

        TypedQuery<Employee> query = entityManager.createQuery(cq);

        return query.getResultList();
    }
}
