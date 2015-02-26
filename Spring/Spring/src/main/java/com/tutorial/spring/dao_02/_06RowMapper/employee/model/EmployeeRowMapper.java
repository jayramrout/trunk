package com.tutorial.spring.dao_02._06RowMapper.employee.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
		employee.setFirst_name(rs.getString("FIRST_NAME"));
		employee.setJob_id(rs.getString("JOB_ID"));
		return employee;
	}
}
