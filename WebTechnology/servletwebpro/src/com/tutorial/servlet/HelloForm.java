package com.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 * @WebServlet(description = "My Hello World", urlPatterns = { "/HelloWorld" })
 */
@WebServlet(description = "Hello Form", urlPatterns = { "/helloForm" })
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message = "";
	
	public HelloForm() {
		message = "Hello World";
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("In the init Method");
	}
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     response.setContentType("text/html");
//		response.setContentType("text/plain");
		//response.setContentType("applications/xml");
		/**
		 * Check the content Types in the below URL
		 * http://www.freeformatter.com/mime-types-list.html
		 */
//		response.setContentType("application/msword");
	     int age = Integer.parseInt(request.getParameter("age"));
	     int idealHeight = 200/age;
	     
	      PrintWriter out = response.getWriter();
		  String title = "Using GET Method to Read Form Data";
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//en\">\n";
	      out.println(docType +
	                "<html>\n" +
	                "<head><title>" + title + "</title></head>\n" +
	                "<body bgcolor=\"#f0f0f0\">\n" +
	                "<h1 align=\"center\">" + title + "</h1>\n" +
	                "<ul>\n" +
	                "  <li><b>First Name</b>: "
	                + request.getParameter("first_name") + "\n" +
	                "  <li><b>Last Name</b>: "
	                + request.getParameter("last_name") + "\n" +
	                "</ul>\n" +
	                "Your Height should be "+ idealHeight+
	                "</body></html>");
	}
	@Override
	public void destroy() {
		System.out.println("In the destroy Method");
	}
}
