package jrout.tutorial.corejava.threads.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Restaurant {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		Waiter waiter = new Waiter("RajuWaiter");

		Customer jigs = new Customer("Jigs", waiter);
		Customer rohini = new Customer("Rohini", waiter);
		Customer nuzhat = new Customer("Nuzhat", waiter);

		List<Thread> threads = new ArrayList<>();
		threads.add(jigs);
		threads.add(rohini);
		threads.add(nuzhat);

		for (Thread t : threads) {
			t.start();
		}
		/*
		 * Below code is used to wait for all the threads to finish.
		 * and then it prints the Total time
		 */
		/*try {
			for (Thread t : threads) {
				t.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
*/
		while(Thread.activeCount() > 1) {
			
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime);
		long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(totalTime);

		System.out.println("Total Time =" + timeSeconds);
	}
}
