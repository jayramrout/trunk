package jrout.tutorial.corejava.threads;

public class ComputerClient {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		ComputerThread ct = new ComputerThread(); // Created the thread
		
		Thread t1 = new Thread(ct);
		
		Thread t2 = new Thread(ct);
		Thread t3 = new Thread(ct);
		
		
		t1.setName("HP");
		System.out.println("Start " + t1.getState());
		t1.start(); // Started the thread
		System.out.println("Start " + t1.getState());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("END " + t1.getState());
//		t1.start(); // we cannot start a thread which is dead
	}
}