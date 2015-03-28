package jrout.tutorial.corejava.classes;

public class Bike {

	int petrolLiter;
	String name;
	int length;

	/**
	 * Constructor with no argument
	 */
	public Bike() {
		this.petrolLiter = 5;
		this.name = "Bike";
		this.length = 10;
	}

	/**
	 * This is Constructor Overloading
	 * 
	 * @param petrolLiter
	 */
	
	public Bike(int petrolLiter) {
		this.petrolLiter = petrolLiter;
	}

	public Bike(int petrolLiter, String name) {
		this(petrolLiter);
		this.name = name;
	}

	public Bike(int petrolLiter, String name, int length) {
		this(petrolLiter, name); // Calling this class Contructor
		this.length = length;
	}

	public static void main(String[] args) {

		Bike referenceBike1 = new Bike();
		System.out.println("Bike.main()" + referenceBike1.petrolLiter);
		System.out.println("Bike.main()" + new Bike().name);

		Bike bike2 = new Bike(10);
		System.out.println("Bike.main()" + bike2.petrolLiter);

		Bike hondaBike = new Bike(15, "Honda");
		System.out.println("Bike.main()" + hondaBike.petrolLiter + " "
				+ hondaBike.name);

		Bike hondaBike10 = new Bike(15, "Honda", 10);
		System.out.println("Bike.main()" + hondaBike10.petrolLiter + " " + " "
				+ hondaBike10.name + " " + " " + hondaBike10.length);

		System.out.println("BikeClient.main()  " + (new Bike(50).petrolLiter));
	}
}