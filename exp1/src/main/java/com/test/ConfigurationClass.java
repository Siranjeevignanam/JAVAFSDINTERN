package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
	

	@Bean
	public static Address getAddress1()
	{
		return new Address();
	}
	
	public static Address getAddress2()
	{
		return new Address("Tn","Ind",645645);
	}
	@Bean
	public static Employee getEmp1()
	{
		return new Employee();
	}
	
	@Bean
public static Employee getEmp2()
{
	return new Employee(111,"kohli","Delhi","RCB",getAddress2());
	
}
}
