package jrout.tutorial.corejava.collections.sortObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingObjects {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Person("A","Andaman","Army"));
		list.add(new Person("C","Camaron","Worker"));
		list.add(new Person("B","Mass","Cook"));
		list.add(new Person("D","Bombay","Army"));
		
		System.out.println(list);

		Collections.sort(list, new ProfSort());
		
		System.out.println(list);
		
		/*for(Object per : list){
			System.out.println((Person)per);
		}
		
		System.out.println(list);
		
		System.out.println("================");
		
		Collections.sort(list, new ProfSort());
		
		for(Object per : list){
			System.out.println((Person)per);
		}*/
//		System.out.println(list);
	}
}