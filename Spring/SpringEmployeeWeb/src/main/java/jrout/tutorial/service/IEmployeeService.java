package jrout.tutorial.service;

import jrout.tutorial.domain.Employee;

/**
 * Created by jrout on 5/18/17.
 */
public interface IEmployeeService {
    Employee fetchEmployee(String empId);
}
