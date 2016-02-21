package com.tutorial.hibernate.mappings.association.many2many;
// 4th
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many2ManyClient {
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
		Set certificates = new HashSet();
		certificates.add(new ProfessionalCertificate("SCJP")); 
		certificates.add(new ProfessionalCertificate("MCA")); 
		certificates.add(new ProfessionalCertificate("MBA"));

		Many2ManyClient mm = new Many2ManyClient();

		mm.addStudent("Rakesh", "Rout", 5000, certificates);
		mm.addStudent("Hemesh", "Rasmia", 5000, certificates);

	}
	public Integer addStudent(String fname, String lname, int salary, Set cert){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		Integer employeeID = null; 
		try{ 
			tx = session.beginTransaction(); 
			Student employee = new Student(fname, lname, salary); 
			employee.setCertificates(cert); 
			employeeID = (Integer) session.save(employee); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
		return employeeID; 
	}

	/* Method to list all the employees detail */ 
	public void listEmployees( ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ tx = session.beginTransaction(); 
		List employees = session.createQuery("FROM Student").list(); 
		for (Iterator iterator1 = employees.iterator();iterator1.hasNext();){ 
			Student student = (Student) iterator1.next(); 
			System.out.print("First Name: " + student.getFirstName()); 
			System.out.print(" Last Name: " + student.getLastName()); 
			System.out.println(" Salary: " + student.getSalary()); 
			Set certificates = student.getCertificates(); 
			for (Iterator iterator2 = certificates.iterator(); iterator2.hasNext();){ 
				ProfessionalCertificate certName = (ProfessionalCertificate) iterator2.next(); 
				System.out.println("Certificate: " + certName.getName()); 
			} 
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
	public void updateEmployee(Integer id, int salary ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Student employee = (Student)session.get(Student.class, id); 
			employee.setSalary( salary ); 
			session.update(employee); 
			tx.commit(); 
		}catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	} 
	/* Method to delete an employee from the records */ 
	public void deleteEmployee(Integer id){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{
			tx = session.beginTransaction(); 
			Student employee = (Student)session.get(Student.class, id); 
			session.delete(employee); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	}
}

