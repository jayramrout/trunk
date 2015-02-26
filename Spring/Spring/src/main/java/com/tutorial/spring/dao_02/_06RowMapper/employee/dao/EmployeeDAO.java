package com.tutorial.spring.dao_02._06RowMapper.employee.dao;

import java.util.List;

import com.tutorial.spring.dao_02._06RowMapper.employee.model.Employee;

public interface EmployeeDAO 
{
	public void insert(Employee employee);
	
	public void insertNamedParameter(Employee employee);
			
	public void insertBatch(List<Employee> employee);
	
	public void insertBatchNamedParameter(List<Employee> employee);
	
	public void insertBatchNamedParameter2(List<Employee> employee);
			
	public void insertBatchSQL(String sql);
	
	public Employee findByEmployeeId(int custId);
	
	public Employee findByEmployeeId2(int custId);

	public List<Employee> findAll();
	
	public List<Employee> findAll2();
	
	public String findEmployeeNameById(int custId);
	
	public int findTotalEmployee();
	
}




