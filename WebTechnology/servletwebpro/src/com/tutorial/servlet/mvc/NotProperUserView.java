package com.tutorial.servlet.mvc;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;


/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(name="NotProperUserView" ,description = "My Hello World", urlPatterns = { "/NotProperView" })
public class NotProperUserView extends HttpServlet {
	private static Logger log = Logger.getLogger(NotProperUserView.class);
	private static final long serialVersionUID = 1L;
	String message = "";

	public NotProperUserView() {
		message = "U are not a proper user...";
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

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		
		System.out.println("MessageView.doGet()" + fname + " "+ lname);	
		PrintWriter out = response.getWriter();
		
		out.println("<h1>" + message + "</h1>");
		out.println("<h1>" + fname + " "+ lname+ "</h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		doGet(request, response);
	}

	


}