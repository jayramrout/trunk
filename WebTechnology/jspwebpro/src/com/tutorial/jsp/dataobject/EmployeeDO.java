package com.tutorial.jsp.dataobject;

import java.io.Serializable;

public class EmployeeDO implements Serializable{
	private String empid;
	private String fname;
	private String lname;
	private String email;
	
	public String getEmpid() { // empid
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getFname() { //fname
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
