package jrout.tutorial.corejava.threads.restaurant;

public class Customer extends Thread {
	public Customer(String name , Waiter waiter) {
		super(waiter);
		setName(name);
	}
}