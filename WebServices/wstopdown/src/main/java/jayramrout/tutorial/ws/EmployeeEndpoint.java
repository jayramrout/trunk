package jayramrout.tutorial.ws;

import jayramrout.tutorial.employee.schemas.EmployeeRequest;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@Endpoint
public class EmployeeEndpoint {
	public EmployeeEndpoint() {
	}
	
	@PayloadRoot(namespace = "http://tutorial.jayramrout/employee/schemas", localPart = "EmployeeRequest")
	public void printEmployeeDetails(@RequestPayload EmployeeRequest employeeRequest) {
		System.out.println(employeeRequest.getEmployee().getFirstName());
	}
}