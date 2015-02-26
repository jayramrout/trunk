package com.excel.user;


import java.io.Serializable;

public class StudentCollegeEntity implements Serializable {

	private Long sid;
	private String sname;
	CollegeEntity ce;
	
	
	public CollegeEntity getCe() {
		return ce;
	}

	public void setCe(CollegeEntity ce) {
		this.ce = ce;
	}

	public StudentCollegeEntity(){}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
