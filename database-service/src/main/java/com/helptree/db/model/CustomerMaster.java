package com.helptree.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customermaster",catalog="qb")
public class CustomerMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customerid")
	private Integer customerId;
	@Column(name="customer_name")
	private String customerName;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public CustomerMaster(Integer customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public CustomerMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
