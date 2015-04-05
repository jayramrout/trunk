package jrout.tutorial.corejava.threads;

class FooRunnable extends Thread {
	public synchronized void run() {
		for (int x = 1; x < 10; x++) {
			System.out.println("Printing "+ x +" Name : " + Thread.currentThread().getName());
		}
	}
}