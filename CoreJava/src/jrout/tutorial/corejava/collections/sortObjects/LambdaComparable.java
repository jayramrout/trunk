package com.bhoo.tut;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyList {

	public void sort(List<Books> bookList, Comparator<Books> comp) {
		System.out.println("Finished sorting the items");
	}
}

public class LambdaComparable {
	public static void main(String[] args) {

		List<Books> list = new ArrayList<Books>();
		Books bookOne = new Books("Harry Potter and Sorceror's Stone",
				"J.K.Rowling", 1997);
		 Books bookTwo = new Books("Alice in Wonderland", "Lewis Caroll",
		 1865);
		Books bookThree = new Books("Ponniyin Selvan", "Kalki", 1953);
		Books bookFour = new Books("Kadal pura", "Chandilyan", 1950);
		list.add(bookOne);
		list.add(bookTwo);
		list.add(bookThree);
		list.add(bookFour);

		MyList myObj = new MyList();

		System.out.println("Before sorting \n" + list);

//		myObj.sort(list, new Comparator<Books>() {
//			public int compare(Books one, Books two) {
//				return one.getAuthor().compareTo(two.getAuthor());
//
//			}
//		});
		
//		Collections.sort(list, new Comparator<Books>() {
//			public int compare(Books one, Books two) {
//				return one.getBookName().compareTo(two.getBookName());
//
//			}
//		});
		
		Collections.sort(list, (Books one, Books two) -> one.getBookName().compareTo(two.getBookName()));

		System.out.println("After sorting \n" + list);

	}
}