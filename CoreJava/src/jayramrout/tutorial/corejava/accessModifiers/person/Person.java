package jayramrout.tutorial.corejava.accessModifiers.person;

public class Person {
	private String name;
	private int ssn;
	private int age;
	
	protected int id;
	
	public String getName() {
		return name;
	}
	
	public int getSsn() {
		return this.ssn;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
	}
	public Person(String name, int age , int ssn){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}
	
	public void printMe() {
		System.out.println("Name is " + name +" SSN :"+ssn+" Age : "+ age);
	}
}