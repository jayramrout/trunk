package jrout.tutorial.dao;

import jrout.tutorial.domain.Employee;

/**
 * Created by jrout on 5/18/17.
 */
public interface IEmployeeDAO {
    Employee fetchEmployee(String empId);
}
