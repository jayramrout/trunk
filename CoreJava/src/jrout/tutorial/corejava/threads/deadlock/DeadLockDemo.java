package jrout.tutorial.corejava.threads.deadlock;

public class DeadLockDemo {
	public static String bike = "Bike";
	public static String helmet = "Helmet";

	public static void main(String[] a) {
		Thread one = new MyThread();
		Thread two = new YourThread();
		one.setName("Todd");
		two.setName("Marry");
		
		one.start();
		two.start();
	}
	
	private static class MyThread extends Thread {
		public void run() {
			synchronized (bike) {
				final String threadName = Thread.currentThread().getName();
				System.out.println(threadName +" Holds lock on "+ bike);

				System.out.println(threadName+" waiting for lock on " + helmet);
				synchronized (helmet) {
					System.out.println(threadName+" Holds lock on Both Resources");
				}
				System.out.println("END OF "+threadName);
			}
		}
	}
	
	private static class YourThread extends Thread {
		public void run() {
			synchronized (helmet) {
				final String threadName = Thread.currentThread().getName();
				System.err.println(threadName+" Holds lock on " + helmet);

				System.err.println(threadName+" waiting for lock on " + bike);
				synchronized (bike) {
					System.err.println(threadName+" Holds lock on both Objects");
				}
				System.err.println("END OF "+threadName);
			}
		}
	}
}
