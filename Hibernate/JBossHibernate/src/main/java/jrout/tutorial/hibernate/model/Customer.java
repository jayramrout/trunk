package jrout.tutorial.hibernate.model;

// Generated Mar 15, 2015 6:09:27 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer implements java.io.Serializable {

	private CustomerId id;
	private BigDecimal amount;

	public Customer() {
	}

	public Customer(CustomerId id) {
		this.id = id;
	}

	public Customer(CustomerId id, BigDecimal amount) {
		this.id = id;
		this.amount = amount;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cid", column = @Column(name = "CID", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "tid", column = @Column(name = "TID", nullable = false, precision = 5, scale = 0)) })
	public CustomerId getId() {
		return this.id;
	}

	public void setId(CustomerId id) {
		this.id = id;
	}

	@Column(name = "AMOUNT", precision = 7)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}