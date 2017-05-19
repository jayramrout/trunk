package jrout.tutorial.service.impl;

import jrout.tutorial.dao.IEmployeeDAO;
import jrout.tutorial.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.domain.Employee;
import jrout.tutorial.service.IEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jrout on 5/18/17.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    @Resource
    IEmployeeDAO iEmployeeDAO;

    @Override
    public Employee fetchEmployee(String empId) {
        return iEmployeeDAO.fetchEmployee(empId);
    }
}
