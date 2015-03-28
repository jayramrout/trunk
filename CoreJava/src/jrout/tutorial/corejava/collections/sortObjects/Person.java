package jrout.tutorial.corejava.collections.sortObjects;

public class Person implements Comparable {
	String name;
	String place;
	String profession;
	public Person(String n, String p, String pr) {
		name = n; place = p; profession = pr;
	}
	
	public String toString() {
		return name + " " + place + " " + profession + "\n";
	}
	
	public int compareTo(Object d) {
		return this.name.compareTo(((Person)d).getName());
//		return this.place.compareTo(((Person)d).getPlace());
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

//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return (name.hashCode() + place.hashCode() * 45)+ 56;
//	}
}