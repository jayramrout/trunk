package jrout.tutorial.hibernatecore.compositePK4;

public class CustomerBean {

private CompositeKey key;
private float amount;


public void setKey(CompositeKey key)
{
	this.key=key;
}

public CompositeKey getKey()
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
