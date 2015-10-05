package jrout.tutorial.corejava.threads.waitnotify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyAll {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
//		ExecutorService exec = Executors.newFixedThreadPool(10);
//		exec.submit(calculator);
		
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		
		calculator.start();
	}
}

class Reader extends Thread {
	Calculator c;

	public Reader(Calculator calc) {
		c = calc;
	}

	public void run() {
		synchronized (c) {
			try {
				System.out.println("Waiting for calculation...");
				c.wait();
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + Thread.currentThread().getName()
					+ " " + c.total);
		}
	}
}

class Calculator extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			
			notifyAll();
		}
	}
}
