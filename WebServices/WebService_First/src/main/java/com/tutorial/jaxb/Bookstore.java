package com.tutorial.jaxb;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(namespace = "com.tutorial.jaxb", name = "Store")
public class Bookstore {

	/**
	 *  XmLElementWrapper generates a wrapper element around XML representation
	 *  XmlElement sets the name of the entities
	 *  <bookList>
	        <book>
	            <author>James Goslin</author>
	            <title>Core Java</title>
	            <publisher>Excel</publisher>
	            <isbn>909-8876548</isbn>
	        </book>
    	</bookList>
	 */
	@XmlElementWrapper(name = "bookList")
	@XmlElement(name = "book")
	private ArrayList<Book> bookList;

	private String name;
	private String location;

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public ArrayList<Book> getBooksList() {
		return bookList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
} 