/**
 * 
 */
package com.tutorial.spring.aop_04.account;

/**
 * @author Jayram
 *
 */
public class Account {
	long currentAmount = 100;
	String name;
	public long deposit(long depositAmount) {
		currentAmount += depositAmount;
		return currentAmount;
	}

//	System.out.println("I m logging something...");
	public long withdraw(long withdrawalAmount,String name) {
		this.name = name;
		String user = getUser();
		System.out.println("I m logging something..."); // JOIN POINT // POINT CUT
        if (user.equals("BankAdmin")){
//        	con.commit();
        // JOIN POINT
        	
        	if (withdrawalAmount <= currentAmount) {
    			currentAmount -= withdrawalAmount;
        	}
        	
        	//con.commit();
        	
        }
		return currentAmount;
	}
	//System.out.println("I m logging something..."); 
      public String getUser(){
    	 return name;
      }
}
