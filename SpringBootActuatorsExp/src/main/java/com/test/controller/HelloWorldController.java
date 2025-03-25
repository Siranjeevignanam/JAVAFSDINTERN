package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;

@RestController
public class HelloWorldController {

	User obj=new User();
	@Value ("${name.fname}")
	private String fname;
	@Value ("${email.email}")
	private String email;
	@Value ("${desg.role}")
	private String role;
	
	@GetMapping("/test")
	public String testActuator()
	{
		obj.setFname(fname);
		obj.setEmail(email);
		obj.setRole(role);
		
		return "Simple Actuator response"+obj;
	}
}
