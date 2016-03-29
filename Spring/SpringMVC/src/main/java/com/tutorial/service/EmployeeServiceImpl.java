package com.tutorial.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String getEmployeeName(int empId) {
		return "Hello "+ empId+" your name is Emely";
	}

}
