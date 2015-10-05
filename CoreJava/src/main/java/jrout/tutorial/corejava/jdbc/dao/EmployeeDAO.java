package jrout.tutorial.corejava.jdbc.dao;

import java.util.List;

import jrout.tutorial.corejava.jdbc.domains.Employee;

public interface EmployeeDAO {
	public List<Employee> getEmployeeDetails(int salary);
}
