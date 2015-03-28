package jrout.tutorial.corejava.methods;

public class Animal {
	String color;
	// int length;
	AnimalLength length;
	String breed;

	/*
	 * public Animal(){
	 * 
	 * }
	 */
	public Animal(AnimalLength size) {
		this.length = size;
	}

	/*
	 * public Animal(int size) { this.length = size; }
	 */

	public void printMyBehaviour(int i) {

		if (i == length.getSize()) {
			System.out.println("My Length is " + length
					+ " I am a Pomorian Animal");
		} else if (i == length.size) {
			System.out.println("My Length is " + length + " I am a Rat Animal");
		} else if (i == length.getSize()) {
			System.out.println("My Length is " + length
					+ " I am a Tiger Animal");
		}

		/*if (AnimalLength.SMALL == length) {
			System.out.println("My Length is " + length
					+ " I am a Pomorian Animal");
		} else if (AnimalLength.MEDIUM == length) {
			System.out.println("My Length is " + length + " I am a Rat Animal");
		} else if (AnimalLength.LARGE == length) {
			System.out.println("My Length is " + length
					+ " I am a Tiger Animal");
		}
*/
		/*
		 * if(1 == length){ System.out.println("My Length is " + length
		 * +" I am a Pomorian Animal"); }else if(2 == length){
		 * System.out.println("My Length is " + length +" I am a Rat Animal");
		 * }else if(3 == length) { System.out.println("My Length is " + length
		 * +" I am a Tiger Animal"); }
		 */
	}

	/*
	 * public void printMyBehaviour(){
	 * 
	 * if(AnimalLength.SMALL.getSize() == length.getSize()){
	 * System.out.println("My Length is " + length +" I am a Pomorian Animal");
	 * }else if(2 == length.getSize()){ System.out.println("My Length is " +
	 * length +" I am a Rat Animal"); }else if(3 == length.getSize()) {
	 * System.out.println("My Length is " + length +" I am a Tiger Animal"); }
	 * 
	 * if(AnimalLength.SMALL == length){ System.out.println("My Length is " +
	 * length +" I am a Pomorian Animal"); }else if(AnimalLength.MEDIUM ==
	 * length){ System.out.println("My Length is " + length
	 * +" I am a Rat Animal"); }else if(AnimalLength.LARGE == length) {
	 * System.out.println("My Length is " + length +" I am a Tiger Animal"); }
	 * 
	 * if(1 == length){ System.out.println("My Length is " + length
	 * +" I am a Pomorian Animal"); }else if(2 == length){
	 * System.out.println("My Length is " + length +" I am a Rat Animal"); }else
	 * if(3 == length) { System.out.println("My Length is " + length
	 * +" I am a Tiger Animal"); } }
	 */
	/**
	 * Method OverLoading
	 * 
	 * @param args
	 */
	public void printMyBehaviour(AnimalLength size) {
		System.out.println("Animal.printMyBehaviour() I am String");
		/*
		 * if(length > 2 && breed == "tiger"){
		 * System.out.println("My Length is " + length
		 * +" I am a Big animal....."); }else {
		 * System.out.println("My Length is " + length
		 * +" I am a Normal Animal"); }
		 */

	}

	/*public void printMyBehaviour(int breed) {
		System.out.println("Animal.printMyBehaviour() I am INTEGER");
	}*/

	public static void main(String[] args) {

		/*
		 * Animal pomorian = new Animal(1); Animal tiger = new Animal(3);
		 */
		// pomorian.printMyBehaviour();
		// pomorian.printMyBehaviour();

		// tiger.printMyBehaviour();
	}
}
