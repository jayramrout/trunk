package jrout.tutorial.springbootsoaptopdownconsumer;

import jrout.tutorial.employee.schema.EmployeeRequest;
import jrout.tutorial.employee.schema.EmployeeType;
import jrout.tutorial.springbootsoaptopdownconsumer.client.EmployeeClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SpringBootTest
class SpringBootSoapTopDownConsumerApplicationTests {

    @Autowired
    Jaxb2Marshaller jaxb2Marshaller;

    @Test
    void contextLoads() {
    }

    @Test
    void wsClient(){
        EmployeeRequest employeeRequest = new EmployeeRequest();
        EmployeeType employeeType = new EmployeeType();
        employeeType.setFirstName("Santa");
        employeeType.setLastName("Pan");
        employeeRequest.setEmployee(employeeType);


        WebServiceTemplate ws = new WebServiceTemplate();
        ws.setMarshaller(jaxb2Marshaller);
        //ws.setUnmarshaller(jaxb2Marshaller);

        ws.marshalSendAndReceive("http://localhost:8080/ws/employee",employeeRequest,
                new SoapActionCallback("http://tutorial.jrout/employee/schemas/EmployeeRequest"));
    }
}
