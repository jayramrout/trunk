package com.tutorial.spring.orm_03.SelectAll;

import org.springframework.orm.hibernate3.*;
import java.util.*;

/**
 *
 */
public class EventDao
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
		List  l =ht.loadAll(EventDO.class);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			EventDO ob=(EventDO)it.next();
			System.out.print(ob.getEventid());
			System.out.println(" "+ob.getEventname());
			System.out.println("--------------");
		}
		
	}
	
}



	

