package com.tutorial.spring.core_01.applicationContextContainer._00singleton;

public class Client
{
	public static void main(String[] args) 
	{
		try
		{
			SingletonClass t1 = SingletonClass.getInstance();
			SingletonClass t2 = SingletonClass.getInstance();
			SingletonClass t3 = (SingletonClass) t2.clone();
			//Test t4 = (Test) t3.clone();

			System.out.println(t1.hashCode());
			System.out.println(t2.hashCode());
			System.out.println(t3.hashCode());	
			/*t1 = null;
			t1 = Test.getTest();
			 */
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
