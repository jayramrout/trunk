package jrout.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.List;

import jrout.tutorial.corejava.accessModifiers.person.Person;

public class FruitsCollection {
	List<String> fruitList = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		/*FruitsCollection fruits = new FruitsCollection();
		fruits.addFruits("Apple");
		fruits.addFruits("Banana");
		fruits.addFruits("Orange");
		
		fruits.addFruits("");
		
		
		System.out.println(fruits.fruitList);*/
		
		addPerson();
		
		
	}
	
	public void addList(){
		List<String> computerList = new ArrayList<String>();
		computerList.add("");
//		computerList.add(new Integer(10));
	}
	
	public static void addPerson(){
		/*Person per1 = new Person("Jay",30,1234);
		Person per2 = new Person("Jay2",30,1234);

		List<Person> personList = new ArrayList<Person>();
		personList.add(per1);
		personList.add(per2);
*/		
		Person per1 = new Person("Jay",30,1234);
		Person per2 = new Person("Jay2",31,1234);

		List<Person> personList = new ArrayList<Person>();
//		List personList = new ArrayList();
		personList.add(per1);
		personList.add(per2);

		for(int i = 0 ; i < personList.size(); i++){
			Person obj = personList.get(i);
			System.out.println(obj.getAge());
		}
		System.err.println("=============================");
		for(Person per : personList){
			System.out.println(per.getName());
		}
	}
	
	public void addFruits(String obj){
		fruitList.add(obj);
	}
}