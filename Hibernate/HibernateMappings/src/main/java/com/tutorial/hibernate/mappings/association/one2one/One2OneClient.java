package com.tutorial.hibernate.mappings.association.one2one;
// 2nd
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2OneClient {
	private static SessionFactory factory;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{ 
			factory = new Configuration().configure("hibernate.mysql.cfg.xml").buildSessionFactory(); 
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex); 
			throw new ExceptionInInitializerError(ex); 
		}

		Address address1 = addAddress("Semi","BBSR","ORISSA","455555");
		Integer empid1 = addPerson("Jayram", "Rout", 3000, address1);
		
		Address address2 = addAddress("Semi","BBSR","ORISSA","455555");
		Integer empid2 = addPerson("Tanu", "Rout", 5000, address2);
		
		listPersons();
	}
	/**
	 * 
	 * @param street
	 * @param city
	 * @param state
	 * @param zipcode
	 * @return
	 */
	public static Address addAddress(String street, String city, String state, String zipcode) { 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		Integer addressID = null; 
		Address address = null; 
		try{ 
			tx = session.beginTransaction(); 
			address = new Address(street, city, state, zipcode); 
			addressID = (Integer) session.save(address); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
		return address; 
	}
	/* Method to add an employee record in the database */ 
	public static Integer addPerson(String fname, String lname, int salary, Address address){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		Integer employeeID = null; 
		try{ 
			tx = session.beginTransaction(); 
			Person person = new Person(fname, lname, salary, address); 
			employeeID = (Integer) session.save(person); 
			tx.commit();
		}catch (HibernateException e) { 
			if (tx!=null) tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
		return employeeID; 
	}

	/* Method to list all the employees detail */ 
	public static void listPersons( ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			List persons = session.createQuery("FROM Person").list(); 
			for (Iterator iterator = persons.iterator(); iterator.hasNext();){ 
				Person employee = (Person) iterator.next(); 
				System.out.print("First Name: " + employee.getFirstName()); 
				System.out.print(" Last Name: " + employee.getLastName()); 
				System.out.println(" Salary: " + employee.getSalary()); 
				Address add = employee.getAddress(); 
				System.out.println("Address "); 
				System.out.println("\tStreet: " + add.getStreet()); 
				System.out.println("\tCity: " + add.getCity()); 
				System.out.println("\tState: " + add.getState()); 
				System.out.println("\tZipcode: " + add.getZipcode()); 
			} 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally {
			session.close(); 
		} 
	}

	/* Method to update salary for an employee */ 
	public static void updatePerson(Integer personId, int salary ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Person employee = (Person)session.get(Person.class, personId); 
			employee.setSalary( salary ); 
			session.update(employee); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) tx.rollback(); 
			e.printStackTrace(); 
		}finally { session.close(); 
		} 
	} 
	/* Method to delete an employee from the records */ 
	public void deletePerson(Integer personID){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Person employee = (Person)session.get(Person.class, personID); 
			session.delete(employee); tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null)
				tx.rollback(); 
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}
}
