package jayramrout.tutorial.employee.ws;

import javax.jws.WebService;

@WebService(serviceName="EmployeeService" , portName="EmployeePort" , endpointInterface="jayramrout.tutorial.employee.ws.Employee")
public class EmployeeImpl implements Employee {

	public void employee(EmployeeType employeeType) {
		System.out.println("**** " + employeeType.getFirstName());
	}
}