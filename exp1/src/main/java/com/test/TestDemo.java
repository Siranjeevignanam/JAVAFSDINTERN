package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigurationClass.class);
	Employee obj=(Employee)ctx.getBean("getEmp2");
	System.out.println(obj);
	
}
}
