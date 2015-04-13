package jrout.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import jrout.tutorial.dao.EmployeeDAO;
import jrout.tutorial.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements  EmployeeService {
	
	public List getEmployeeDetails(int salary) {
		EmployeeDAO empDao = new EmployeeDAOImpl();
		List employees = empDao.getEmployeeDetails(salary);
		
		List newEmployeeList = new ArrayList();
		
//		for(;;) {
//			// Check for salary...
//			//add extra bonus...
//		}
			
		return newEmployeeList;
		
	}
	
}
