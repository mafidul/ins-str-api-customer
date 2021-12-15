package com.tcs.ins.cust.repository.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "ORDERDETAIL")
public class Order {
	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	@Column(name = "ORDER_NUMBER")
	private Long ordernumber;
	@Column(name = "VERSION")
	private String version;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
	private Customer customer;
}