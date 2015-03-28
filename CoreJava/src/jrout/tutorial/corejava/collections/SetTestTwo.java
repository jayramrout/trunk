package jrout.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTestTwo {

	public static void main(String[] args) {
//		treeSet();
		arrayListToTreeSet();
		
//		System.out.println(hashSset());
	}
	
	// Person ssn , place
	// Jayram , 1234 , concord
	// Tanu , 1111, NY
	// Raj, 23232, concord
	
	public static Set  hashSset(){
		Set hashSet = new HashSet();
		hashSet.add("Apple");
		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Banana");
		
		return hashSet;
	}
	
	public static void treeSet(){
		Set treeSet = new TreeSet();
		treeSet.add("Apple");
		treeSet.add("Apple");
		treeSet.add("Orange");
		treeSet.add("Banana");
		
		System.out.println(treeSet);
	}
	
	public static void arrayListToTreeSet(){
		ArrayList list =  new ArrayList();
		list.add("12121");
		list.add("Apple");
		list.add("apple");
		list.add("Orange");
		list.add("Banana");
		
		Set hashSet = new HashSet(list);
		
		Set treeSet = new TreeSet(list);
		
//		System.out.println(list);
		System.out.println(hashSet);
		System.out.println(treeSet);
		
		//so if I have a file of 500MB text file, 
		//how do you propose I save each line and look for duplicate values?

	}
}
