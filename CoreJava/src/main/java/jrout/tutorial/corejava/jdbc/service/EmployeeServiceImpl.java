package jrout.tutorial.corejava.jdbc.service;

import java.util.ArrayList;
import java.util.List;

import jrout.tutorial.corejava.jdbc.dao.EmployeeDAO;
import jrout.tutorial.corejava.jdbc.dao.EmployeeDAOImpl;

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
