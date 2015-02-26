package com.excel.user;

import java.io.Serializable;

public class NameEntity implements Serializable {

	private Long id;
	private String surname;
	private String lastname;
	StudentEntity se;
	
	public StudentEntity getSe() {
		return se;
	}

	public void setSe(StudentEntity se) {
		this.se = se;
	}

	public NameEntity(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}