package com.excel.compositePK4;

public class CustomerBean {

private CompKey key;
private float amount;


public void setKey(CompKey key)
{
	this.key=key;
}

public CompKey getKey()
{
	return this.key;
}

public void setAmount(float amount)
{
	this.amount = amount;
}

public float getAmount() 
{
	return this.amount;
}

}
