package com.tutorial.hibernate.mappings.collections_mysql_2.set;

/**
 * Implement 
 * @author Jayram
 *
 */
public class Certificate { // This is for Set
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
	 * Required in case of SET 
	 */
	public boolean equals(Object obj) { 
		if (obj == null) return false; 
		if (!this.getClass().equals(obj.getClass())) 
			return false; 
		Certificate obj2 = (Certificate)obj; 
		if((this.id == obj2.getId()) && (this.name.equals(obj2.getName()))) { 
			return true; 
		} 
		return false; 
	}

	  /**
	   * Required in case of SET
	  */
	public int hashCode() { 
		int tmp = 0; 
		tmp = ( id + name ).hashCode();
		return tmp; 
	}
	  

	 
}
