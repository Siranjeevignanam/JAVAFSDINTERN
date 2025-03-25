package com.test.entity;

import org.springframework.beans.factory.annotation.Value;

public class User {

	
	private String fname;
	
	private String email;

	private String role;
	
	
	public void setFname(String fname) {
		this.fname = fname;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [fname=" + fname + ", email=" + email + ", role=" + role + "]";
	}
	
}
