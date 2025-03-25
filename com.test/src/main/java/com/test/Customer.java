package com.test;

import java.util.List;

public class Customer 
{
private String name;
private String country;
private List<String>orders;
private Address adr;



public Customer(String name, String country, List<String> orders, Address adr) {
	
	this.name = name;
	this.country = country;
	this.orders = orders;
	this.adr = adr;
}


public Customer()
{
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public List<String> getOrders() {
	return orders;
}
public void setOrders(List<String> orders) {
	this.orders = orders;
}
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	this.adr = adr;
}

@Override
public String toString() {
	return "Customer [name=" + name + ", country=" + country + ", orders=" + orders + "]";
}
}
