package jrout.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTestOne {

	public static void main(String[] args) {
		arrayListExample();
	}
	
	/**
	 *	ArrayList is Ordered 
	 */
	public static void arrayListExample() {
		List list = getNumbersFromDataBase();
		System.out.println(list);
		list.add(2, "THREE");
		System.out.println(list);
		
//		list.add(new Integer(10));
//		Person per = new Person("Jayram","Concord","SW");
//		list.add(per);
//		System.out.println(list.contains("SEVEN"));
		
//		System.out.println(" FOUR "+ list.get(3));
		
//		System.out.println(" First "+list);
		/*for(int i = 0 ; i < list.size();i++){
			System.out.println(list.get(i));
		}
		
		/*Iterator iter = list.iterator();
		while(iter.hasNext()){
			String value = (String)iter.next();
			
			if(value.equals("FOUR")){
				iter.remove();
			}
		}*/
		
		/*for(Object str : list){
			System.out.println(str);
		}*/
		
//		System.out.println("Last "+ list);
	}
	
	
	
	
	
	
	public static void printName(String nameArray[]) {
		for (String name : nameArray) {
			System.out.println(name);
		}
	}

	public static void queryCase() {
	}

	public static void iterateArrayList() {
		List list = new java.util.LinkedList();
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		System.out.println("Before =========" + list + "========");

		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			String value = (String) iter.next();
			System.out.print(value + " ");
			if (value == "THREE")
				iter.remove();
		}

		System.out.println("\nAfter =========" + list + "========");
	}
	
	public void oldArray() {
		String nameArray[] = new String[4];

		nameArray[0] = "Jayram";
		nameArray[1] = "Rout";

		nameArray[2] = "Diyansha";
		nameArray[3] = "Rout";

		// nameArray[4]="Test";

		String newArray[] = new String[10];
		int i = 0;
		for (i = 0; i < nameArray.length; i++) {
			newArray[i] = nameArray[i];
		}
		newArray[i + 1] = "Testing";
	}
	
	public static List getNumbersFromDataBase(){
		// Select Number_Name from NumberTable
//		List list = new ArrayList();
		List list = new LinkedList();
		list.add("ONE");
		list.add("TWO");
		list.add("FOUR");
		list.add("FIVE");
		list.add("SIX");
		return list;
	}
}
