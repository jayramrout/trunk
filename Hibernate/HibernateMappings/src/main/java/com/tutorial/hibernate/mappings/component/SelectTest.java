package com.tutorial.hibernate.mappings.component;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.pojo.JobType;
import com.tutorial.hibernate.pojo.Person;
import com.tutorial.hibernate.util.HibernateUtil;

public class SelectTest
{
	public static void main(String args[])
	{
		try
		{
			Configuration cfg = new Configuration();
			//read configuration file
			cfg  = cfg.configure("hibernate.oracle.cfg.xml");

			SessionFactory factory = cfg.buildSessionFactory();
			Session ses = factory.openSession();

			/*Query q1= ses.createQuery("from Person");
			List l=q1.list(); //excute the HQL

			for(int i = 0; i < l.size(); i++)
			{
				Person p= (Person)l.get(i);
				JobType jt = p.getPjob();

				System.out.println(p.getPid()+"  "+p.getPname()+"  "+jt.getJob()+"  "+jt.getSalary()+"  "+jt.getDepartment());
			}*/

			Person p = (Person) ses.get(Person.class, new Integer(1));
			JobType jt = p.getPjob();
			System.out.println(p.getPid()+"  "+p.getPname()+"  "+jt.getJob()+"  "+jt.getSalary()+"  "+jt.getDepartment());
			ses.close();
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
		}

	}//main
}//class