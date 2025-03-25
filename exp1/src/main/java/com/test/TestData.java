package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		//Employee obj=(Employee)ctx.getBean("emp"); 
		Employee ob=ctx.getBean("emp",Employee.class);
		Employee obj=ctx.getBean("emp1",Employee.class);
		System.out.println(obj);
		System.out.println(obj.getAobj());
		System.out.println(ob);
		System.out.println(ob.getAobj());
	}

}
