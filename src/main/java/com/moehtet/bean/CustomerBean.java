package com.moehtet.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.moehtet.entity.Customer;

@ManagedBean
@ViewScoped
public class CustomerBean {
	public List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}
	@PostConstruct
	public void setUp() {
		Customer c1 = new Customer();
		c1.setCustomerId(1);
		c1.setFirstName("AA");
		c1.setLastName("BB");
		customers.add(c1);
		
		Customer c2 = new Customer();
		c2.setCustomerId(2);
		c2.setFirstName("cc");
		c2.setLastName("dd");
		customers.add(c2);
		
		Customer c3 = new Customer();
		c3.setCustomerId(3);
		c3.setFirstName("ee");
		c3.setLastName("ff");
		customers.add(c3);
	}
}
