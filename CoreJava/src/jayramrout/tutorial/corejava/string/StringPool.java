package jayramrout.tutorial.corejava.string;

import jayramrout.tutorial.corejava.extendsExample.Human;

public class StringPool {

	public static void main(String[] args) {
		String name = "Jayram";
		String name2 = "Jayram";
		String name3 = "Jayram";
		
		String name4 = new String("Jayram");
		
		System.out.println(name4==name);
		System.out.println(name4.equals(name));
		
		Human human1 = new Human("Jayram", 6 , "USA");
		Human human2 = new Human("Jayram", 6 , "USA");
		Human human11 = human1;
		
		//Object huma12 = new Human("Jayram", 6 , "USA");
		
		System.out.println(human1.equals(human11));
		
		System.out.println(human1.equals(human2));
	}
}
