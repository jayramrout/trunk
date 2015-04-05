package jrout.tutorial.corejava.threads.waitnotify;
public class WaitNotify {
	public static void main(String [] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b) {
			System.out.println("WaitNotify.main()");
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {}
		}

		System.out.println("Total is: " + b.total);
	}
}

class ThreadB extends Thread {
	int total;
	public void run() {
		synchronized(this) {
			for(int i=0;i<100;i++) {
				total += i;
			}
			try{
				Thread.sleep(3000);
			}catch(Exception exp){}

			notify();
		}

	}
}