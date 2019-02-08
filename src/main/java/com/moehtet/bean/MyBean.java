package com.moehtet.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "myBean")
@RequestScoped
public class MyBean {
//	@ManagedProperty(value = "customerBean")
	private CustomerBean cBean;

	public CustomerBean getcBean() {
		return cBean;
	}

	public void setcBean(CustomerBean cBean) {
		this.cBean = cBean;
	}
	
}
