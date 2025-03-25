package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producttable")

public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private int quantity;
	private String brand;
	private String destination;



	public String getName() {
		return name;
	}
	public Product(String name, int id, int quantity, String brand, String destination) {
		super();
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.brand = brand;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", quantity=" + quantity + ", brand=" + brand + ", destination="
				+ destination + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	public Product()
	{
		
	}
	}
