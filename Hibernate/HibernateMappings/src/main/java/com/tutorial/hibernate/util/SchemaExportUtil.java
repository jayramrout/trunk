package com.tutorial.hibernate.util;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
 
public class SchemaExportUtil {
 
	public static void main(String arg[]){
		Configuration config=new Configuration();
		config.configure("hibernate.mysql.cfg.xml");
		new SchemaExport(config).create(true, true);
		SessionFactory factory=config.buildSessionFactory();
		Session sess=factory.openSession();
	}
}