package com.test;



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
	Address a=new Address();
	a.setId(1);;
	a.setCity("Cochin");
	a.setState("Kerala");
	a.setCountry("India");
	
	Employee e=new Employee();
	e.setId(2);
	e.setName("Samson");
	e.setEmail("sanjurr@gmail.com");
	e.setAdr(a);
	
	a.setEmp(e);
	
	session.save(e);
	
	
	t.commit();
	//persistent state
	System.out.println("Done ");
	
	session.clear();//detached state
		
				
	}
}
