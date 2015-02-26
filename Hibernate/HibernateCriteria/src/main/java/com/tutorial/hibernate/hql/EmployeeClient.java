package com.tutorial.hibernate.hql;


import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployeeClient {
	private static SessionFactory factory;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{ 
			factory = new Configuration().configure().buildSessionFactory(); 
			
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex); 
			throw new ExceptionInInitializerError(ex); 
		}
//		criteriaExamples();
//		projections();
	}
	
	public static void criteriaExamples(){
		Session session = factory.openSession();
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction();
			
//			Employees emp = (Employees)session.get(Employees.class, 100);
//			System.out.println("EmployeeClient.main()" + emp.getEmail());
			
			Criteria cr = session.createCriteria(Employees.class); // Select * from Employees
			
//			cr.add(Restrictions.eq("salary", new BigDecimal(9500))); // Select * from employees where salary = 9500
			
//			cr.add(Restrictions.gt("salary", new BigDecimal(9500))); // for salary greater than
//			cr.add(Restrictions.lt("salary", new BigDecimal(9500))); // for salary less than
//			cr.add(Restrictions.like("firstName", "D%"));
//			cr.add(Restrictions.ilike("firstName", "D%")); // Case - insensitive
//			cr.add(Restrictions.between("salary", new BigDecimal(1000), new BigDecimal(3000)));
//			cr.add(Restrictions.isNull("salary"));
//			cr.add(Restrictions.isNotNull("salary"));
//			cr.add(Restrictions.isEmpty("salary"));
//			cr.add(Restrictions.isNotEmpty("salary"));
//			
			// AND OR Conditions Starts
//			Criterion salary = Restrictions.gt("salary", new BigDecimal(2000)); 
//			Criterion name = Restrictions.ilike("firstName","D%");
//			LogicalExpression orExp = Restrictions.or(salary, name); 
//			cr.add( orExp );
////			
//			LogicalExpression andExp = Restrictions.and(salary, name); 
//			cr.add( andExp );
			// AND OR Conditions Ends
			
			// For Order
			cr.add(Restrictions.gt("salary", new BigDecimal(2000)));
			cr.addOrder(Order.desc("salary"));
//			cr.addOrder(Order.asc("salary"));
			// For Order
			
			List employees = cr.list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();){ 
				Employees employee = (Employees) iterator.next(); 
				System.out.print("First Name: " + employee.getFirstName()); 
				System.out.print(" Last Name: " + employee.getLastName()); 
				System.out.println(" Salary: " + employee.getSalary()); 
			}
			System.out.println("EmployeeClient.main()" + employees.size());
			tx.commit();
		}catch(HibernateException exp){
			exp.printStackTrace();
		}
	}
	/**
	 * The Criteria API provides the org.hibernate.criterion.Projections class which can be used to get average, 
	 * maximum or minimum of the property values. The Projections class is similar to the Restrictions class in 
	 * that it provides several static factory methods for obtaining Projection instances.
	 */
	public static void projections(){
		Session session = factory.openSession();
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction();
			Criteria cr = session.createCriteria(Employees.class);
			// To get total row count. 
//			cr.setProjection(Projections.rowCount()); 
			// To get average of a property. 
//			cr.setProjection(Projections.avg("salary")); 
//			// To get distinct count of a property. 
			cr.setProjection(Projections.countDistinct("firstName")); 
//			// To get maximum of a property. 
//			cr.setProjection(Projections.max("salary")); 
//			// To get minimum of a property. 
//			cr.setProjection(Projections.min("salary")); 
//			// To get sum of a property. 
//			cr.setProjection(Projections.sum("salary"));
			List rows = cr.list();
			System.out.println("Total Count: " + rows.get(0));
			tx.commit();
		}catch(HibernateException exp){
			exp.printStackTrace();
		}
	}

}
