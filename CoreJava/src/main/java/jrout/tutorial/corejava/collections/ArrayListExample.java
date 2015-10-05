package jrout.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import jrout.tutorial.corejava.io.serialization.Person;

public class ArrayListExample {

    public static void main(String[] args) {
        arrayListExample();
//    	vectorExample();
//        iterateArrayList();
//        methodReference();
//        generics();
    }

    /**
     * ArrayList is Ordered
     */
    public static void arrayListExample() {
    	
        List list = getNumbersFromDataBase();
//        System.out.println(list);
        list.add(2, "THREE");
//        System.out.println(list);
        
        System.out.println(list);
        Iterator iter = list.iterator();
        while(iter.hasNext()) {
        	String name = (String)iter.next();
        	System.out.println(name);
        	if("FOUR".equals(name)){
        		iter.remove();
        	}
        }
        
        System.out.println(list);
        
    }


    public static void printName(String nameArray[]) {
        for (String name : nameArray) {
            System.out.println(name);
        }
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
    public static List getNumbersFromDataBase() {
//		List list = new ArrayList();
        List list = new LinkedList();
        list.add("ONE");
        list.add("TWO");
        list.add("FOUR");
        list.add("FIVE");
        list.add("SIX");
        
        return list;
    }

    /**
     * Passing System.out::println method as a static method reference.
     */
    public static void methodReference() {
        List numbers = new ArrayList();
        numbers.add("ONE");
        numbers.add("TWO");
        numbers.add("FOUR");
        numbers.add("FIVE");
        numbers.add("SIX");
        
        Collections.synchronizedList(numbers);
        
        numbers.forEach(System.out::print);
    }
    
    
    public static void generics() {
    	List<String> numbers = new ArrayList();
        numbers.add("ONE");
        numbers.add("TWO");
        numbers.add("FOUR");
        numbers.add("FIVE");
        numbers.add("SIX");
        
        List<Person> persons = new ArrayList<Person>();
        Person per = new Person();
        persons.add(per);
        
        for(String str : numbers) {
        	System.out.println(str);
        }
    }
    
    public static void vectorExample() {
    	Vector vec = new Vector();
    	vec.add("ONE");
    	Iterator iter = vec.iterator();
    }
}
