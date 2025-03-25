package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Annotation {

	
@Bean
public static Student getStd()
{
	List<String> l1=new ArrayList<>();
	l1.add("Java");
	l1.add("python");
	l1.add("C");
	l1.add("C++");
	
	
	return new Student(1,"Rahul",l1);
}
	
@Bean
public static Order getOrder()
{
	return new Order(1,"apple",445);
}
}

//using multiple bean class xml and annotation
//using multiple using bean record xml and annotation