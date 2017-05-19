package jrout.tutorial.servlet;

import jrout.tutorial.service.IEmployeeService;
import jrout.tutorial.springcore.HelloWorld;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/** http://localhost:8080/springempweb/EmployeeServlet?userId=100
 * Created by jrout on 5/18/17.
 */
@WebServlet(name = "EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String userId = request.getParameter("userId");

        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        IEmployeeService service = (IEmployeeService) applicationContext.getBean("employeeService");
        out.println(service.fetchEmployee(userId));
    }
}
