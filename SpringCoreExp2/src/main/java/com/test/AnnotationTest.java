package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Annotation.class);
		
		Order obj=ctx.getBean("getOrder",Order.class);
		System.out.println(obj);
	}

}
