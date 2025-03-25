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
	Book b=new Book();
	b.setBname("Spring");
	b.setAuthor("Siranjeevi");
	b.setPrice(250);
	session.save(b);
	t.commit();
	//persistent state
	System.out.println("Done ");
	
	session.close();//detached state
		
				
	}
}
