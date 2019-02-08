package com.moehtet.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.moehtet.entity.Customer;

@ManagedBean(name="customerBean")
@ViewScoped
public class CustomerBean {
	/**
	 * 
	 */
	private String name = "Aung";
	private List<Customer> customers;
	private String myAjax;
	public List<Customer> getCustomers() {
		return customers;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public String getName() {
		return name;
	}
	public String getMyAjax() {
		return myAjax;
	}

	public void setMyAjax(String myAjax) {
		this.myAjax = myAjax;
	}

	@PostConstruct
	public void init() {
		List<Customer> customers= new ArrayList<>();
		System.out.println("Start ........");
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
		this.customers=customers;
		System.out.println("end ........");
	}
	public void test() {
		System.out.println("Hello ...... ");
	}
}
