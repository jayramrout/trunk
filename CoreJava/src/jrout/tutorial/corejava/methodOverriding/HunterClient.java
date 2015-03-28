package jrout.tutorial.corejava.methodOverriding;

public class HunterClient {

	public static void main(String[] args) {
		
		Cat bengalTiger = new Tiger("Tiger", 120 , "2");
		Object catCheeta = new Cheeta("Cheeta", 150, 40);
		
//		Cheeta cheeta1 = new Cheeta("Cheeta", 150, 40);
		
//		Tiger tiger = new Cat("", 12);
		
		bengalTiger.printBehaviour();
		((Cheeta)catCheeta).printBehaviour();
		
		/**
		 * Casted the cat reference to the Cheeta Class
		 */
		//((Cheeta)catCheeta).climbTree();
		
//		((Cheeta)catCheeta).climbTree();
		
//		((Cheeta)catCheeta).climbTree();
		
		((Cheeta)bengalTiger).climbTree();
		
		//System.out.println(cheeta.hashCode());

//		String behaviour = cheeta.printBehave();
//		System.out.println(behaviour);
		
	}
}