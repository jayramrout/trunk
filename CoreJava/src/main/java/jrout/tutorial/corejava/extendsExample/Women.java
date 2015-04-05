package jrout.tutorial.corejava.extendsExample;

public class Women extends Human {
	
	int longHairLength;
	
	public Women(String country) {
		this.country = country;
	}
	
	public Women(String name, int height , String country) {
//		this.country = country;
//		this.name = name ;
//		this.height = height;
		super(name,height,country);
	}
	
	public static void main(String[] args) {
		
		Women women = new Women("Australia");
		Women women2 = new Women("Resma" ,5 ,"India");
		
		System.out.println(women.country);
		System.out.println(women2.country +" " + women2.name +" "+ women2.height);
		
		women.run();
	}

}
