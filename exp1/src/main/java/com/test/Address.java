package com.test;

public class Address {
	private String state;
	private String country;
	private int pincode;

	public Address()
	{
		
	}
	
	
	public Address(String state, String country, int pincode) {
		super();
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
}
