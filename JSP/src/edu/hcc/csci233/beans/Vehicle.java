package edu.hcc.csci233.beans;

import java.io.Serializable;

public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String make;
	private String model;
	private String year;
	private String bodyStyle;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBodyStyle() {
		return bodyStyle;
	}
	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	
	
}
