package jrout.tutorial.trunk.springbootsoaptopdown.endpoints;

import jrout.tutorial.employee.schema.EmployeeLeaveRequest;
import jrout.tutorial.employee.schema.EmployeeMessage;
import jrout.tutorial.employee.schema.EmployeeRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndPoint {
    public EmployeeEndPoint() {
    }

    @PayloadRoot(namespace = "http://tutorial.jrout/employee/schemas", localPart = "EmployeeRequest")
    public void printEmployeeDetails(@RequestPayload EmployeeRequest employeeRequest) {
        System.out.println(employeeRequest.getEmployee().getFirstName());
    }

	@PayloadRoot(namespace = "http://tutorial.jrout/employee/schemas", localPart = "EmployeeLeaveRequest")
	@ResponsePayload
	public EmployeeMessage getEmployee(@RequestPayload EmployeeLeaveRequest employeeRequest) {
		System.out.println("Leave Request "+ employeeRequest.getEmployee().getFirstName());
		EmployeeMessage employeeMessage = new EmployeeMessage();
		employeeMessage.setMessage(employeeRequest.getEmployee().getFirstName() +" Leave Granted..");
		return employeeMessage;
	}
}
