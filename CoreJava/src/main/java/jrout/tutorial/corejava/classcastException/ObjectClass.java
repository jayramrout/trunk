package jrout.tutorial.corejava.classcastException;

public class ObjectClass {
	String state;
	public ObjectClass(String state) {
		this.state = state;
	}
	
	/**
	 * Final Method
	 */
	final void printState(){
		System.out.println("I am " + state);
	}
}
