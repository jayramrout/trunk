package com.tutorial.hibernate.mappings.collections_mysql_2.sortedset;

/**
 * Implement 
 * @author Jayram
 *
 */

public class Certificate  implements Comparable <Certificate>{ // This is for SortedSet
	private int id; 
	private String name; 
	public Certificate() {} 
	public Certificate(String name) { 
		this.name = name; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This is for SortedSet
	 */
	public int compareTo(Certificate that){ 
		final int BEFORE = -1; 
		final int AFTER = 1; 
		if (that == null) { 
			return BEFORE; 
		} 
		Comparable thisCertificate = this.getName(); 
		Comparable thatCertificate = that.getName(); 
		if(thisCertificate == null) { 
			return AFTER; 
		} else if(thatCertificate == null) { 
			return BEFORE; 
		} else { 
			return thisCertificate.compareTo(thatCertificate); 
		} 
	}
}
