package edu.hcc.csci233.po;

import edu.hcc.csci233.beans.Address;
import edu.hcc.csci233.beans.Customer;
import edu.hcc.csci233.beans.Vehicle;

public class PersonalInfo {

	private Customer customer;
	private Address address;
	private Vehicle vehicle;
	
	public String getFirstName() {
		return customer.getFirstName();
	}
	public void setFirstName(String firstName) {
		customer.setFirstName(firstName);
	}
	public String getLastName() {
		return customer.getLastName();
	}
	public void setLastName(String lastName) {
		customer.setLastName(lastName);
	}
	public String getStreet() {
		return address.getStreet();
	}
	public void setStreet(String street) {
		address.setStreet(street);
	}
	public String getCity() {
		return address.getCity();
	}
	public void setCity(String city) {
		address.setCity(city);
	}
	public String getState() {
		return address.getState();
	}
	public void setState(String state) {
		address.setState(state);
	}
	public String getMake() {
		return vehicle.getMake();
	}
	public void setMake(String make) {
		vehicle.setMake(make);
	}
	public String getModel() {
		return vehicle.getModel();
	}
	public void setModel(String model) {
		vehicle.setModel(model);
	}
	public String getYear() {
		return vehicle.getYear();
	}
	public void setYear(String year) {
		vehicle.setYear(year);
	}
	public String getBodyStyle() {
		return vehicle.getBodyStyle();
	}
	public void setBodyStyle(String bodyStyle) {
		vehicle.setBodyStyle(bodyStyle);
	}
	
	
}
