package com.tutorial.jaxb.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.tutorial.jaxb.Book;
import com.tutorial.jaxb.Bookstore;
/**
 * 
 * @author Jayram
 *standalone = Yes in the generated xml 
 *means you haven't referred the xml contents from outside
 */
public class Main {

	private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";

	public static void main(String[] args) throws JAXBException, IOException {

		ArrayList<Book> bookList = new ArrayList<Book>();

		// create books
		Book book1 = new Book();
		book1.setIsbn("909-8876548");
		book1.setName("Core Java");
		book1.setAuthor("James Goslin");
		book1.setPublisher("Excel");
		bookList.add(book1);

		Book book2 = new Book();
		book2.setIsbn("674-9829475");
		book2.setName("Dot Net");
		book2.setAuthor("Charles Don");
		book2.setPublisher("Oreilly");
		bookList.add(book2);

		// create bookstore, assigning book
		Bookstore bookstore = new Bookstore();
		bookstore.setName("Excel Store");
		bookstore.setLocation("Concord");
		bookstore.setBookList(bookList);

		// create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext.newInstance(Bookstore.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write to System.out
		m.marshal(bookstore, System.out);

		// Write to File
		m.marshal(bookstore, new File(BOOKSTORE_XML));

		// get variables from our xml file, created before
		System.out.println();
		System.out.println("Output from our XML File: ");
		Unmarshaller um = context.createUnmarshaller();
		Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(
				BOOKSTORE_XML));
		ArrayList<Book> list = bookstore2.getBooksList();
		for (Book book : list) {
			System.out.println("Book: " + book.getName() + " from "
					+ book.getAuthor());
		}
	}
}