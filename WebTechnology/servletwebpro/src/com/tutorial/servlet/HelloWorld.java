package com.tutorial.servlet;

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

import org.apache.log4j.Logger;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(name="HelloWorld" ,description = "My Hello World", urlPatterns = { "/hiWorld" })
public class HelloWorld extends HttpServlet {
	private static Logger log = Logger.getLogger(HelloWorld.class);
	private static final long serialVersionUID = 1L;
	String message = "";

	
	static Connection con = null;
	static Statement stmt =null;
	static PreparedStatement pstmt = null;
	CallableStatement cs = null;
	ResultSet rs = null;
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	static String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";

	public HelloWorld() {
		message = "Hello Excel World";
	}

	private void loadDriver(){
		try{
			Class.forName(driver);//Loading a driver...
		}catch(ClassNotFoundException exp){
			exp.printStackTrace();
			log.error("Issues in Class Not Found"+ exp.getMessage());
		}
	}
	
	private Connection getConnection(){
		try{
			con = DriverManager.getConnection(connectionURL,"hr","hr");
		}catch(Exception exp){
			exp.printStackTrace();
		}
		return con;
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
//		HttpSession session = request.getSession();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		System.out.println("First Name "+ fname);
		
//		try{
//			insertStudentInfo(fname,lname);
//		}catch(Exception exp){
//			
//		}

		PrintWriter out = response.getWriter();
		
		Cookie [] cooki = request.getCookies();
		if(cooki !=null){
			for(Cookie cook : cooki){
				if("myUniquieID".equals(cook.getName()) && "78656483".equals(cook.getValue())){
					out.println("I am an existing client...");
				}
				log.info("Return value from Cookies "+ cook.getName() +" cook value "+ cook.getValue());
			}
		}else{
			Cookie cookie = new Cookie("myUniquieID","78656483");
			response.addCookie(cookie);
			out.println("I am NOT an existing client...");
		}
		
//		if(true)
//			throw new ServletException();
		
		
		out.println("<h1>" + message + "</h1>");
		out.println("<h1>" + fname + " "+ lname+ "</h1>");
		out.println("<h1>I am in goGet</h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//		String fname = request.getParameter("fname");
		//		String lname = request.getParameter("lname");
		//		
		//		PrintWriter out = response.getWriter();
		//		out.println("<h1>" + message + "</h1>");
		//		out.println("<h1>" + fname + " "+ lname+ "</h1>");
		//		out.println("<h1>I am in goPost</h1>");
		doGet(request, response);
	}

	public void insertStudentInfo(String fname, String lname) throws Exception{
		try{
			loadDriver();
			con = getConnection();
			
			con.setAutoCommit(false);

			pstmt = con.prepareStatement("insert into students(s_id,firstname,lastname) values(STUDENT_SEQUENCE.nextval,?,?)");

			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			int intValue = 0;
			intValue = pstmt.executeUpdate();

			log.info("Return value from insert "+ intValue);
		}catch(Exception exp){
			exp.printStackTrace();
			try{
				con.rollback();
			}catch(Exception exp1){
				throw exp1;
			}
			throw exp;
		}finally{
			closeConnections(rs,stmt,con);
		}
	}
	private void closeConnections(ResultSet rs , Statement stmt , Connection con){
		try{
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(con != null){
				con.close();
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}


}