package jrout.tutorial.hibernate.dao;

import jrout.tutorial.hibernate.model.Employees;
import org.springframework.data.repository.CrudRepository;


public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
