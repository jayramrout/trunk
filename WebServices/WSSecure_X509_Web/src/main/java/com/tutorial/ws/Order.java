package com.tutorial.ws;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * @XmlRootElement is part of the Java Architecture for XML Binding (JAXB) annotation library
 */
@XmlRootElement(name = "Order")
public class Order {

	private String customerID;
	private String itemID;
	private int qty;
	private double price;

	// Contructor
	public Order() {
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
