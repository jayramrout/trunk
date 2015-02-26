package com.excel.user;

import java.io.Serializable;

public class CollegeEntity implements Serializable {

	private Long collegecode;
	private String cname;
	
	public CollegeEntity(){}
	public Long getCollegecode() {
		return collegecode;
	}
	public void setCollegecode(Long collegecode) {
		this.collegecode = collegecode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}