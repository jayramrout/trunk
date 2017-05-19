package jrout.tutorial.dao.impl;

import jrout.tutorial.dao.IEmployeeDAO;
import jrout.tutorial.domain.Employee;
import org.springframework.stereotype.Component;

/**
 * Created by jrout on 5/18/17.
 */
@Component
public class EmployeeDAOImpl implements IEmployeeDAO{

    @Override
    public Employee fetchEmployee(String empId) {
        Employee employee = new Employee();
        employee.setEmpId("2345");
        employee.setEmpName("Testing");
        employee.setSalary("1234");

        return employee;
    }
}
