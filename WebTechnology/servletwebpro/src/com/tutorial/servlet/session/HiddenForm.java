package com.tutorial.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;



/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(name="HiddenForm" ,description = "HiddenForm", urlPatterns = { "/hiddenForm" })
public class HiddenForm extends HttpServlet {
	private static Logger log = Logger.getLogger(HiddenForm.class);
	private static final long serialVersionUID = 1L;
	String message = "";

	public HiddenForm() {
		message = "Hello Excel World";
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String myName = request.getParameter("myName");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		
		PrintWriter out = response.getWriter();
		String myuniqueID = request.getParameter("myUniquieID");
		String myuniqueValue = "78656483";
		
		if("78656483".equals(myuniqueID)){
			out.println("<h1> Existing Client</h1>");
			out.println("<h1>" + message + "</h1>");
			out.println("<h1>" + fname + " "+ lname+ "</h1>");
			out.println("<h1> I am in " + myName+ " session</h1>");
		}else{
			out.println("<h1> New Client </h1>");
		}
		System.out.println("request.getContextPath() " + request.getContextPath());
		out.println("<html>");
		out.println("<head> <title>Hidden Form Fields</title> </head>");
		out.println("<body> <form action='hiddenForm' method='POST'> " +
				"First Name: <input type='text' name='fname'> <br /> " +
				"Last Name: <input type='text' name='lname' /> " +
				"<input type='submit' value='Submit' /> " +
				"<a href='"+request.getContextPath()+"/hiddenForm?myUniquieID=78656483'> My HREF</a>");
				
		out.println("<input type='hidden' name='myUniquieID' value='"+myuniqueValue+"'/></form> </body> </html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		doGet(request, response);
	}
}