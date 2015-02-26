package com.tutorial.spring.dao_02._06RowMapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.spring.dao_02._06RowMapper.employee.dao.EmployeeDAO;
import com.tutorial.spring.dao_02._06RowMapper.employee.model.Employee;

public class JdbcTemplateClient {
	public static void main(String[] args) {
		// if you have time,
		// it's better to create an unit test rather than testing like this :)

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/dao_02/_06RowMapper/employee/Employee.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("customerDAO");
		Employee emp1 = new Employee(1, "Testing1", "21");
		Employee emp3 = new Employee(2, "Testing2", "22");
		Employee emp2 = new Employee(3, "Testing3", "23");
		// create table EMPLOYEE_BK(EMPLOYEE_ID int , FIRST_NAME varchar2(20),
		// JOB_ID varchar2(20));
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		employeeDAO.insertBatch(employees);

		// String sql =
		// "UPDATE EMPLOYEES SET SALARY =5000 where EMPLOYEE_ID=104";
		// employeeDAO.insertBatchSQL(sql);
		// System.out.println("Batch Insert Done!");
		//
		// Employee employee1 = employeeDAO.findByEmployeeId(100);
		// System.out.println("Employee A : " + employee1);

		// Employee employee2 = employeeDAO.findByEmployeeId2(104);
		// System.out.println("Employee B : " + employee2);
		//
		// List<Employee> employeesA = employeeDAO.findAll();
		// for(Employee emp: employeesA){
		// System.out.println("Employee As : " + emp);
		// }
		//
		// List<Employee> employeesB = employeeDAO.findAll2();
		// for(Employee emp: employeesB){
		// System.out.println("Employee Bs : " + emp);
		// }

		// String employeeName = employeeDAO.findEmployeeNameById(100);
		// System.out.println("Employee Name : " + employeeName);
		//
		// int total = employeeDAO.findTotalEmployee();
		// System.out.println("Total : " + total);
		//
		// delete all records
		// employeeDAO.insertBatchSQL("DELETE FROM Employee_bk");
		// System.out.println("Records Deleted!");

	}
}
