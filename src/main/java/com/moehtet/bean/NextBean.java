package com.moehtet.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean(name = "nextBean")
@ViewScoped
public class NextBean {
	private String text;
	private String country;
	private String city;
	private List<String> cities = new ArrayList<>();
	private Map<String,List<String>> citiesMap =  new HashMap<>();
	private Map<String, String> countries = new HashMap<>();
	private Date date;
	@PostConstruct
	public void init() {
		countries.put("Myanmar", "Myanmar");
		countries.put("Thai", "Thai");
		List<String> list= new ArrayList<>();
		list.add("Yangon");
		list.add("Mandalay");
		List<String> list1= new ArrayList<>();
		list1.add("Bangout");
		list1.add("tttt");
		citiesMap.put("Myanmar", list);
		citiesMap.put("Thai", list1);
		cities.add("Select One");
	}
	public String getText() {
		return text;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Map<String, List<String>> getCitiesMap() {
		return citiesMap;
	}
	public void setCitiesMap(Map<String, List<String>> citiesMap) {
		this.citiesMap = citiesMap;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Map<String,String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String,String> countries) {
		this.countries = countries;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void selectChangeListener() {
		cities.clear();
		cities.addAll(citiesMap.get(country));
		
	}
	public List<String> autoComplete(String input){
		List<String> result = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			result.add(input+i);
		}
		return result;	
	}
	public Date getToday() {
		return new Date();
	}
}
