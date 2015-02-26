package com.tutorial.spring.orm_03.SelectAll;

//eventdao.java
import org.springframework.orm.hibernate3.*;
import java.util.*;

public class eventdao
{
	HibernateTemplate ht;

	public void setHt(HibernateTemplate ht)
	{
		this.ht=ht;
	}


	public void saveObject(Object o)
	{
		ht.save(o);	
	}
	
	public void selectAll()
	{
		List  l =ht.loadAll(eventpojo.class);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			eventpojo ob=(eventpojo)it.next();
			System.out.print(ob.getEventid());
			System.out.println(" "+ob.getEventname());
			System.out.println("--------------");
		}
		
	}
	
}



	

