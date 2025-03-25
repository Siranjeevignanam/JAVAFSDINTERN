package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeansTest {
public static void main(String[] args) {
	ApplicationContext ct1=new ClassPathXmlApplicationContext("beans.xml");
	Customer obj1=ct1.getBean("cus",Customer.class);
	System.out.println(obj1);
	ApplicationContext ct2=new ClassPathXmlApplicationContext("beans.xml");
	Address obj2=ct2.getBean("ad",Address.class);
	System.out.println(obj2);
}
}
