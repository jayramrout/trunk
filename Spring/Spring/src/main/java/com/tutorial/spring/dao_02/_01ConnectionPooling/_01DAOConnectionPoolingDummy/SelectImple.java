package com.tutorial.spring.dao_02._01ConnectionPooling._01DAOConnectionPoolingDummy;

import java.sql.*;
import javax.sql.DataSource;
public class  SelectImple  implements SelectInter {
	DataSource ds = null;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public String fetchEmpName(int eno) {
		try {
			//get access to jdbc connection object from jdbc connection pool through data source object "ds"
			Connection con = ds.getConnection();
			//persistence logic
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select First_name from employees where EMPLOYEE_ID = "+eno);
			if(rs.next()) {
				return rs.getString(1);
			} else {
				System.out.println("No record found with employee number: "+eno);
			}
			rs.close();
			st.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
			return "Record not found";
		} catch(Exception e) {
			e.printStackTrace();
			return "Record not found";
		}//catch
		return "Record not found";
	}//fetch empName


	public long fetchEmpSalary(int eno) {
		try {
			//get access to jdbc connection object from jdbc connection pool through data source object "ds"
			Connection con = ds.getConnection();
			//persistence logic
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select salary from employees where EMPLOYEE_ID = "+eno);
			if(rs.next()) {
				return rs.getLong(1);
			} else {
				System.out.println("No record found with employee number: "+eno);
			}
			rs.close();
			st.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
			return 0;
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}//catch
		return 0;
	}//fetch empsalary
}