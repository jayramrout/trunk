package jrout.tutorial.corejava.jdbc;

import java.util.List;

import jrout.tutorial.corejava.jdbc.service.EmployeeService;
import jrout.tutorial.corejava.jdbc.service.EmployeeServiceImpl;

public class JDBCClient {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		List list = service.getEmployeeDetails(4000);
		System.out.println(list);
	}

}
