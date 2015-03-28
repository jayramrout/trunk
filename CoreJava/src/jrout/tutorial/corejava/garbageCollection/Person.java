package jrout.tutorial.corejava.garbageCollection;

public class Person {
	String name;
	String occupation;
	static int objectCreationCounter =0;
	static int objectDestroyedCounter =0;
	public Person() {
		this.name= "Person : "+objectCreationCounter++;
		System.out.println("Name is " + name);
	}

	public void printName() {
		System.out.println("Name is " + name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		objectDestroyedCounter++;
		System.out.println("Object Destroyed is ==========="+ this.name);
	}
}