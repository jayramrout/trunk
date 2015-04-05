package jrout.tutorial.corejava.enumexample;

enum Month {
	JAN(0),FEB(1),MAR(2),APRIL(3);
	
	int value;
	private Month(int value) {
		this.value = value;
	}
}

class Hello {
	
}
 public class EnumExample {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		if(i == Month.JAN.value) {
			System.out.println("Month is January");
		}else if(i == 1) {
			System.out.println("Month is Feburary");
		}else if(i == 2) {
			System.out.println("Month is March");
		}else if(i == 3) {
			System.out.println("Month is April");
		}
		
		Month jan = Month.JAN;
		System.out.println("EnumExample.main()" + jan.value);
	}

}
