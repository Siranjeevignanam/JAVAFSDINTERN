package com.test;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class StoreData {

	
	public static void main(String[] args) {
		//1.)create configuration class object
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//2.)create sessionFactory object
		SessionFactory sf = cfg.buildSessionFactory();
		//3.)create session object
		Session session =sf.openSession();
		//4.)transaction object
	Transaction t=session.beginTransaction();
	Skills skl1=new Skills();
	skl1.setSkillname("Spring");
	Skills skl2=new Skills();
	skl2.setSkillname("Python");
	
	Student std=new Student();
	std.setName("Rahul");
	
	
List<Skills> l1=new ArrayList<>();
l1.add(skl1);
l1.add(skl2);
std.setSkills(l1);
session.save(std);

	t.commit();
	//persistent state
	System.out.println("Done ");
	
	session.clear();//detached state
		
				
	}
}
