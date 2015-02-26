package jayramrout.tutorial.corejava.methods;

public class Calculation {
	int firstValue;
	int secondValue;
	
	public int getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	public int getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}
	
	public Calculation(int a , int b) {
		this.firstValue = a;
		this.secondValue = b;
	}
	
	public void justCallMe(){
		System.out.println("Just call me");
	}
	
	public int addMe(){
		return firstValue + secondValue;
	}
	
	public void subMe(String message) {
		System.out.println( firstValue-secondValue);
	}
	
	/*public int subMe(String message) {
		System.out.println( a-b);
		return 10;
	}*/
	
	public int addValue(int a , int b) {
		System.out.println("a= "+ a);
		a = a+10;
		b = b+5;
		
		return a+b;
	}
	
	public static int subValue(int a , int b) {
		return a-b;
	}
	public String subMe(String message , String name) {
		System.out.println( firstValue-secondValue);
		return "";
	}
	
	public static void main(String[] args) {
		Calculation add = new Calculation(10, 20);
		
		int value = add.addValue(12, 12);
		
		int finalValue = value + 10;
		
		System.out.println("Finale Value =" + finalValue);
		
//		add.add();
		/*int calulatedVale = add.addMe();
		int finalValue = calulatedVale + 10;
		
		System.out.println( finalValue);
		
		Calculation sub = new Calculation(10, 5);
		sub.firstValue = 12;
	*/	
	}

}
