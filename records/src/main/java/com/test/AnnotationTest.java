package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest
{
public static void main(String[] args) {
	ApplicationContext cxt1=new AnnotationConfigApplicationContext(Annotation.class);
	
Customer obj1=cxt1.getBean("getCustomer",Customer.class);
System.out.println(obj1);

ApplicationContext cxt2=new AnnotationConfigApplicationContext(Annotation.class);
Address obj2=cxt2.getBean("getAddress",Address.class);
System.out.println(obj2);
}
	
}
