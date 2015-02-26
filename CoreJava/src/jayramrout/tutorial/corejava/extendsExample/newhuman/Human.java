package jayramrout.tutorial.corejava.extendsExample.newhuman;

public class Human {
	String name;
	int height;
	String country;
	
	public void run(){
		System.out.println("I am running");
	}
	/**
	 * 
	 */
	public Human() {
		name = "Human";
		height = 10;
		country = "India";
	}
	/**
	 * One Argument constructor
	 * @param country
	 */
	public Human(String country, String name , int height) {
		this.country = country;
		this.name = name;
		this.height = height;
	}
	public void calculateBehaviour(){
		System.out.println("Human Behaviour is "+ height*10 + " Name is "+ name);
	}
}
