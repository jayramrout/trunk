package jrout.tutorial.corejava.methods;

public class ExperiencedAnimalCreator {

	public static void main(String[] args) {
		
		int i  = 10;
		int j = 10;
		
		if(i == j) {
			
		}
		
		Animal pomorian = new Animal(AnimalLength.SMALL);
		pomorian.printMyBehaviour(1);
		
		
		/*Animal rat = new Animal(AnimalLength.MEDIUM);
		Animal tiger = new Animal(AnimalLength.LARGE);
		
		pomorian.printMyBehaviour();
		rat.printMyBehaviour();
		tiger.printMyBehaviour();*/
		
	}
}