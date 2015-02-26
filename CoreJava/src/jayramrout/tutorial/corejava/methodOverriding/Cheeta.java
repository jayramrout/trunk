package jayramrout.tutorial.corejava.methodOverriding;

public class Cheeta extends Cat {
	int numberOfDots;
	public Cheeta( String catName , int speed ,int numberOfDots) {
		super(catName , speed);
		this.numberOfDots = numberOfDots;
	}
	
	@Override
	public void printBehaviour() {
		System.out.println("I can RUN Faster than anyone...");
	}
	
	public String printBehave() {
		return "I am a behaviour";
	}
//	@Override
	public String toString() {
		return "I am Cheeta Number Of DOTS are : "+ numberOfDots;
	}
	
	public void climbTree(){
		System.out.println("Climb Tree");
	}
}