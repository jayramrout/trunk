package com.tutorial.spring.orm_03._01PureHibernateExample;

public class StudentBean implements java.io.Serializable {
	private int sid;
	private String sname;
	private float tot_m;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setTot_m(float tot_m) {
		this.tot_m = tot_m;
	}

	public float getTot_m() {
		return tot_m;
	}
}
