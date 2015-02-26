package hibernateproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmp {

	public static void main(String[] args)
	{
		Employee usha = new Employee();
		usha.setEmp_id(103);
		usha.setEmp_name("usha");
		usha.setEmp_dept("mech");
		
		Employee raj = new Employee();
		raj.setEmp_id(104);
		raj.setEmp_name("raj");
		raj.setEmp_dept("oracle");
//		createRow(usha);
		deleteRow(usha);
		
	}
	
	private static void createRow(Employee name)
	{
		Configuration c = new Configuration();
		c.configure("hibernateproj/Hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction(); 
		s.save(name);
		t.commit();	
	}
	private static void deleteRow(Employee name)
	{
		Configuration c = new Configuration();
		c.configure("hibernateproj/Hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(name);
		t.commit();		
	}
}
