package com.test.service.impl;

import java.util.List;

import javax.naming.NotContextException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.CustomerDao.CustomerDao;
import com.test.entity.Customer;
import com.test.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer createCustomer(Customer cst) {
		try
		{
			if(cst!=null)
			{
				customerDao.createCustomer(cst);
			}
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Customer> readAllCustomers() {
		List<Customer> list=customerDao.readAllCustomers();
		try
		{
			
			 if(list.size()<0)
			 {
				 System.out.println("No content");
			 }
			 
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Customer> updateAllCustomers(Customer cst) {
		
		List<Customer> list=customerDao.updateAllCustomers(cst);
		
		try
		{
			
			 customerDao.updateAllCustomers(cst);
			 
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		
		return customerDao.updateAllCustomers(cst);
	}

	
	@Override
	public List<Customer> deleteCustomer(int id) {
		
 List<Customer> list=customerDao.deleteCustomer(id);
		
		try
		{
			
			 customerDao.deleteCustomer(id);
			 
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		
		return customerDao.deleteCustomer(id);
		
	}
	
	}
	
	


