package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ProductDao;
import com.test.entity.Product;
import com.test.repository.ProductRepository;
import com.test.service.ProductService;

@Service
public class ServiceImplementation implements ProductService{

	@Autowired
	private ProductRepository repo;



	@Override
	public Product createProduct(Product pro) {
		
		return repo.save(pro);
	}

	@Override
	public List<Product> readAllProduct() {
		
		
		return repo.findAll();
	}

	@Override
	public List<Product> updateProduct(Product pro)
	{
		
		repo.save(pro);
		return repo.findAll();
	}

	@Override
	public List<Product> deleteProduct(int id) {
//		
		Optional<Product> op = repo.findById(id);
		try
		{
			repo.deleteById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return repo.findAll();
	}
	
	
	
}
