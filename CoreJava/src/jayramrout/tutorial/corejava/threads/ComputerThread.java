package jayramrout.tutorial.corejava.threads;

//public class ComputerThread extends Thread {
public class ComputerThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0 ; i  < 3 ; i++){
			System.out.println("Running computer"+i +" " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}