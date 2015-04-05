package jrout.tutorial.corejava.threads;

public class TestThreads {
	public static void main(String[] args) {
		FooRunnable r = new FooRunnable();
		
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		Thread three = new Thread(r);

		one.setName("Fred");
		two.setName("Andrew");
		three.setName("Bob");
		
		three.start();
		two.start();
		one.start();
	}
}