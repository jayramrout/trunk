package com.excel.user;


import java.io.Serializable;

public class StudentEntity implements Serializable {

	
	private Long id;
	private String sname;
	private Long sage;
	NameEntity ne;
	
	
	
	public NameEntity getNe() {
		return ne;
	}

	public void setNe(NameEntity ne) {
		this.ne = ne;
	}

	public StudentEntity(){}
	// generate setters...

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Long getSage() {
		return sage;
	}

	public void setSage(Long sage) {
		this.sage = sage;
	}

	
	
	
}
