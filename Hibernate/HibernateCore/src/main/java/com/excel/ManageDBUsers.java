package com.excel;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excel.user.DBUser;
public class ManageDBUsers { 
	private static SessionFactory factory; 
	public static void main(String[] args) {
		try{ 
			factory = new Configuration().configure().buildSessionFactory(); 
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex); 
			throw new ExceptionInInitializerError(ex); 
		} 
		ManageDBUsers manageUsers = new ManageDBUsers(); 
		/* Add few User records in database */ 
		Integer dbuser1 = manageUsers.addDBUser(1,"HR", "Jayram", new Date()); 
		Integer dbuser2 = manageUsers.addDBUser(2,"Employee", "Jayram", new Date()); 
		Integer dbuser3 = manageUsers.addDBUser(3,"Student", "Jayram", new Date()); 
		/* List down all the DBUsers */
		manageUsers.listDBUsers(); 
		/* Update DBUser's records */ 
		manageUsers.updateDBUser(dbuser1, "Ramesh");
		/* Delete an DBUser from the database */ 
		manageUsers.deleteDBUser(dbuser2); 
		/* List down new list of the DBUsers */ 
		manageUsers.listDBUsers(); 
	} 

	/* Method to CREATE an DBUser in the database */ 
	public Integer addDBUser(int userId, String username, String createdBy,
			Date createdDate){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		Integer DBUserID = null; 
		try{ 
			tx = session.beginTransaction(); 
			DBUser DBUser = new DBUser(userId, username, createdBy,createdDate); 
			DBUserID = (Integer) session.save(DBUser); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
		return DBUserID; 
	} 
	/* Method to READ all the DBUsers */ 
	public void listDBUsers( ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			List DBUsers = session.createQuery("FROM DBUser").list(); 
			for (Iterator iterator = DBUsers.iterator(); iterator.hasNext();) {
				DBUser dbuser = (DBUser) iterator.next();
				System.out.print("User ID: " + dbuser.getUserId());
				System.out.print("User Name: " + dbuser.getUsername());
				System.out.print(" CreatedBy Name: " + dbuser.getCreatedBy()); 
				System.out.println(" CreatedDate: " + dbuser.getCreatedDate()); 
			}
			tx.commit(); 
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback(); 
			e.printStackTrace(); 
		}
		finally { 
			session.close(); 
		} 
	} 
	/* Method to UPDATE salary for an DBUser */ 
	public void updateDBUser(Integer dbuserId, String createdBy){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{
			tx = session.beginTransaction(); 
			DBUser dbuser = (DBUser)session.get(DBUser.class, dbuserId); 
			dbuser.setCreatedBy(createdBy); 
			session.update(dbuser); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	} 
	/* Method to DELETE an DBUser from the records */ 
	public void deleteDBUser(Integer dbuserId){ 
		Session session = factory.openSession(); 
		Transaction tx = null;
		try{ 
			tx = session.beginTransaction(); 
			DBUser dbuser = (DBUser)session.get(DBUser.class, dbuserId); 
			session.delete(dbuser); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	} 
}