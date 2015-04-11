package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrout.tutorial.service.EmployeeService;
import jrout.tutorial.service.EmployeeServiceImpl;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
       System.out.println("I am the contructor....");
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("I am in init method");
    }
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId = request.getParameter("empid");
		String salary = request.getParameter("salary");
		System.out.println("I am the service guy..." + empId + " salary "+ salary);
		
		EmployeeService service = new EmployeeServiceImpl();
		List empList =  service.getEmployeeDetails(Integer.parseInt(salary));
		
		PrintWriter out = response.getWriter();
		//make some database call by calling a DAO.
		out.println("<html><body><table>");
		for(Object obj : empList) {
			out.println("<tr><td>"+obj+"</td></tr>");	
		}
		out.println("</table></body></html>");
		//out.println("<html><body>Hello Guys Today timestamp is <h1>Hello Guys"+new java.util.Date()+"</body></html>");
		//out.println("Hello Guys Today timestamp is " + new java.util.Date());
	}
	
	@Override
	public void destroy() {
		System.out.println("I am destroy method...");
	}
}
