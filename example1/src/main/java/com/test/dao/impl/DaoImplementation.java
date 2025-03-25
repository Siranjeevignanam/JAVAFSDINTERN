package com.test.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.ProductDao;
import com.test.entity.Product;
import com.test.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public abstract class DaoImplementation implements ProductDao {

	@Autowired
	public ProductRepository repository;


	public void setRepository(ProductRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Product createProduct(Product pro)
	{
		return repository.save(pro);
	}
	
	
	
	@Override
	public List<Product>readAllProduct()
	{
		return repository.findAll();
	}
	
	
	@Override
	public List<Product> updateProduct(Product pro)
	{
		repository.save(pro);
		return repository.findAll();
	}
	
	@Override
	public List<Product> deleteProduct (int id)
	{
		repository.deleteById(id);
		return repository.findAll();
	}
}
