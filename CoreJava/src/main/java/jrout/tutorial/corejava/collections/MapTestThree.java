package jrout.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jrout.tutorial.corejava.accessModifiers.person.Person;

public class MapTestThree {

	public static void main(String[] args) {
		
		Person per1 = new Person("Jay",30,1234);
		Person per2 = new Person("Jay2",31,1234);
		List<Person> personList = new ArrayList<Person>();
		personList.add(per1);
		personList.add(per2);
		
		Fruit apple = new Fruit("Apple","10");
		Fruit orange = new Fruit("Orange","11");
		List<Fruit> fruitList = new ArrayList<Fruit>();
		
		Map objectMap = new HashMap();
		objectMap.put("person", personList);
		
		objectMap.put("fruitList", fruitList);
		System.out.println(objectMap.get("person")); // 500
		objectMap.get("Apple"); // 500
		
		/*objectMap.put("one", "HELLO");
		objectMap.put("two", "TWO");
		objectMap.put("three", "THREE");
		objectMap.put(null, null);*/
		
//		System.out.println(objectMap);
		//Person
		
		/*List<Person> personList1 = (List<Person>)objectMap.get("personList");
		
		for(Person per : personList1){
			per.getAge();
			
		}*/
				
//		System.out.println(objectMap.get("personList"));
		
		Iterator iter = objectMap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry mapEntry = (Map.Entry)iter.next();
			System.out.println(mapEntry.getKey() +"  Value = "+ mapEntry.getValue());
		}
		
		/*for(Object entry : objectMap.entrySet()){
			Map.Entry mapEntry = (Map.Entry)entry;
			System.out.println(mapEntry.getKey() +"  Value = "+ mapEntry.getValue());
		}
		
		System.out.println(objectMap.entrySet());
		System.out.println(objectMap.keySet());*/
		
		/*System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		*/
		
		/*String name = new String("Jayram");
		String name2 = new String("Jayram");
		System.out.println(name.equals(name2));*/
		
//		System.out.println(map);
		
		/*Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry mapEntry = (Map.Entry)iter.next();
			System.out.println(mapEntry.getKey() +"  Value = "+ mapEntry.getValue());
		}*/
		
		/*for(Object entry : map.entrySet()){
			Map.Entry mapEntry = (Map.Entry)entry;
			System.out.println(mapEntry.getKey() +"  Value = "+ mapEntry.getValue());
		}*/
	}
}