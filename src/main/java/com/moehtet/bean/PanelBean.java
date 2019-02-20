package com.moehtet.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.CloseEvent;
import org.primefaces.event.ToggleEvent;
@ManagedBean(name = "panelBean")
@ViewScoped
public class PanelBean implements Serializable{
	private String text;
	private int i;
	@PostConstruct
	public void init() {
		System.out.println("Post Construct");
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void handleClose(CloseEvent e) {
		text = "close event.....";
		System.out.println("I'm Close.");
	}
	public void handleToggle(ToggleEvent e) {
		System.out.println(text);
		text = e.getVisibility().name();
		
	}
	public void testViewAction() {
		System.out.println("View Action call");
	}
}
