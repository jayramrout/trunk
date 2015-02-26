package com.tutorial.servlet.mvc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class StudentDAO {
	private static Logger log = Logger.getLogger(StudentDAO.class);
	static Connection con = null;
	static Statement stmt =null;
	static PreparedStatement pstmt = null;
	CallableStatement cs = null;
	ResultSet rs = null;
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	static String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";
	private void loadDriver() throws ClassNotFoundException{
		try{
			Class.forName(driver);
		}catch(ClassNotFoundException exp){
			exp.printStackTrace();
			log.error("Issues in Class Not Found"+ exp.getMessage());
			throw exp;
		}
	}
	
	private Connection getConnection(){
		try{
			con = DriverManager.getConnection(connectionURL,"HR","HR");
		}catch(Exception exp){
			exp.printStackTrace();
		}
		return con;
	}
	
	public void insertStudentInfo(String fname, String lname) throws Exception , ClassNotFoundException{
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
		}catch(ClassNotFoundException cnfe){
			throw cnfe;
		}catch(Exception exp){
			exp.printStackTrace();
			try{
				if(con != null){
					con.rollback();	
				}
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
