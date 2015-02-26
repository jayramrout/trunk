package com.tutorial.hibernate.mappings.association.many2one;
// 1st
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many2OneClient {
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

		Address address = addAddress("Semi","BBSR","ORISSA","455555");
		Integer empid1 = addEmployee("Jayram", "Rout", 3000, address);
		Integer empid2 = addEmployee("Tanu", "Rout", 5000, address);
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
	public static Integer addEmployee(String fname, String lname, int salary, Address address){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		Integer employeeID = null; 
		try{ 
			tx = session.beginTransaction(); 
			Employee employee = new Employee(fname, lname, salary, address); 
			employeeID = (Integer) session.save(employee); 
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
	public static void listEmployees( ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			List employees = session.createQuery("FROM Employee").list(); 
			for (Iterator iterator = employees.iterator(); iterator.hasNext();){ 
				Employee employee = (Employee) iterator.next(); 
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
	public void updateEmployee(Integer EmployeeID, int salary ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
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
	public void deleteEmployee(Integer EmployeeID){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
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
