package jayramrout.tutorial.corejava.collections.sortObjects;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Person("A","Andaman","Army"));
		list.add(new Person("C","Camaron","Worker"));
		list.add(new Person("B","Mass","Cook"));
		list.add(new Person("D","Bombay","Army"));
		list.add(new String("Jayram"));
		list.add(new Integer(5));
		
		for(Object obj : list){
			if(obj instanceof Person){
				System.out.println((Person)obj);
			}else if (obj instanceof String){
				System.out.println(obj);
			}else if(obj instanceof Integer) {
				System.out.println(obj);
			}
		}
	}
}