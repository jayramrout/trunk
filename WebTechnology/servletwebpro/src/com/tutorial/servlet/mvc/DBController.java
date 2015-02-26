package com.tutorial.servlet.mvc;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
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
@WebServlet(name="MessageView" ,description = "My Hello World", urlPatterns = { "/dbController" })
public class DBController extends HttpServlet {
	private static Logger log = Logger.getLogger(DBController.class);
	private static final long serialVersionUID = 1L;
	String message = "";

	public DBController() {
		message = "Hello Excel World";
	}

	@Override
	public void init() throws ServletException {
		super.init();
	}
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//		HttpSession session = request.getSession();
		log.info("I am in DoGET MEthod.....");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");

		try{
			StudentDAO dao = new StudentDAO();
			dao.insertStudentInfo(fname,lname);
		}catch(ClassNotFoundException exp){
			exp.printStackTrace();
			throw new ServletException(exp);
		}catch(Exception ex){
			 ex.printStackTrace();
			 throw new ServletException(ex);
		}
		/*String viewPage = "";
		if(this are good){
			viewPage = "success.html";
		}else{
			viewPage = "error.html";
		}*/
		RequestDispatcher rd1 = request.getRequestDispatcher("MessageView");// success.jsp
		rd1.forward(request, response);
	}

	public void callMe(){}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		doGet(request, response);
	}




}