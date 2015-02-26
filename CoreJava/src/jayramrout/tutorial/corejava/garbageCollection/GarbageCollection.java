package jayramrout.tutorial.corejava.garbageCollection;

public class GarbageCollection {
	public static void main(String[] args) {
		
//		new Person();
		
		/*for(int i =0 ; i < 10000 ; i++) {
			new Person().printName();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("objectCreationCounter  "+ Person.objectCreationCounter);
		System.out.println("objectDestroyedCounter "+Person.objectDestroyedCounter);*/
		
		/**
		 * Object Not Reacheable
		 */
		
		Person p = new Person(); // 1 sec
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.gc();
		System.out.println("I am here" + p); // 6 sec
	}
}