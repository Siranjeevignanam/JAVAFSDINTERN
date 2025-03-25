package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.User;
import com.test.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private  UserRepository repository;
	
	
	

	public static List <User>  tempData=new ArrayList<>();
	
	static
	{
		String [] food= {"breakfast","lunch","dinner"};
		String [] seat= {"M1","M2","L1","L2","U1","U2"};
	tempData.add(new User("Rohit","Sharma","r45@mail.com","Male",food,"Cbe","chennai","15/03/2025",seat));
}

	public  User reservationRequest(User user)
	{
		tempData.add(user);
		return repository.save(user);
		
	}
	
	public  boolean validateCity(User user)
	{
		boolean ft=user.validate(user.getFromCity(),user.getToCity());
		return ft;
	}
	
}