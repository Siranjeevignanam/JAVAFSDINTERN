package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Annotation {

	static List<String> l1=Arrays.asList("helmet","stumps","ball","bat");
	@Bean
	public static Address getAddress()
	{
		return new Address("Cochin","Kerala",641004);
	}
@Bean
public static Customer getCustomer()
{
	return new Customer("Anbu","India",l1,getAddress());
}

	
}
