package jayramrout.tutorial.corejava.accessModifiers.pack1;

public class Calculation {
	private int firstValue; // only inside the class
	int secondValue; // Default Modifier : anywhere inside the same package
	public String type; // Addition or Substraction // anywhere 
	protected String protectedString; // anywhere inside the same package && in sub classses
	
	public Calculation() {
		
	}
	
	public Calculation(int one , int two) {
		this.firstValue = one;
		this.secondValue = two;
	}
	
	public void addMe(int one, int two) {
		System.out.println("Addition Value is "+ (one+two));
	}
	
	void subMe(int one, int two) {
		System.out.println("Substraction Value is "+ (one-two));
	}
	
}