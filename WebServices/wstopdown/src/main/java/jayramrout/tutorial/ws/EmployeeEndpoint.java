package jayramrout.tutorial.ws;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import jayramrout.tutorial.employee.schemas.EmployeeLeaveRequest;
import jayramrout.tutorial.employee.schemas.EmployeeRequest;

@Endpoint
public class EmployeeEndpoint {
	public EmployeeEndpoint() {
	}
	
	@PayloadRoot(namespace = "http://tutorial.jayramrout/employee/schemas", localPart = "EmployeeRequest")
	public void printEmployeeDetails(@RequestPayload EmployeeRequest employeeRequest) {
		System.out.println(employeeRequest.getEmployee().getFirstName());
	}
	
	@PayloadRoot(namespace = "http://tutorial.jayramrout/employee/schemas", localPart = "EmployeeLeaveRequest")
	public void printEmployeeDetails2(@RequestPayload EmployeeLeaveRequest employeeRequest) {
		System.out.println("Leave Request "+ employeeRequest.getEmployee().getFirstName());
	}
}