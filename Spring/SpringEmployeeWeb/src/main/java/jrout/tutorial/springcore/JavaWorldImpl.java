package jrout.tutorial.springcore;

public class JavaWorldImpl implements HelloWorld {
	
	private String courseFee;
	private String duration;
	private Address address;
	
	
	public String sayHello(String name){
		return "Hello welcome to Java world  "+name +" !!!"+
				"\n Your course fee is "+ this.courseFee+""
						+ "\n Duration is "+ this.duration+""
								+ "\n Address where we teach java is "+""
										+ "Country =" + address.getCountry()+" " + address.getStreeAddress();
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public String getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
