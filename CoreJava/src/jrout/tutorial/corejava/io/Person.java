package jrout.tutorial.corejava.io;

import java.io.Serializable;

/**
 * Interfaces without any methods are known as Marker Interface
 * @author Jayram
 *
 */
public class Person  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -4001883821491656368L;
	private String name;
	private String place;
	private String profession;
	private transient int ssn; 
	
	private String role;
	
	public Person(){}
	public Person(String n, String pr, String place) {
		name = n; profession = pr; this.place = place;
	}
	public Person(String n, String pr, String place, int ssn) {
		name = n; profession = pr; this.place = place;
		this.ssn = ssn;
	}
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	@Override
	public String toString() {
		return "Name "+ name +" Profession ="+ profession;
	}
}