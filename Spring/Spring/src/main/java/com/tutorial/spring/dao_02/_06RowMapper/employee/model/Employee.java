package com.tutorial.spring.dao_02._06RowMapper.employee.model;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int employee_id;
	private String first_name;
	private String job_id;
	
	public Employee(){}
	
	public Employee(int employee_id, String first_name, String job_id) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.job_id = job_id;
	}

	
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	@Override
	public String toString() {
		return employee_id +" "+ first_name+" "+ job_id;
	}
}