package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.test.entity.Product;
import com.test.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/product")
public class ProductController  {
	
	@Autowired
	private ProductService service;	

	
	
	
public void setService(ProductService service) {
		this.service = service;
	}



@PostMapping("/create")
public Product createProduct(@RequestBody Product pro)
{
		
		return service.createProduct(pro);
}
	
	
	
@GetMapping("/listpro")
public List<Product> readAllProduct()
{
	return service.readAllProduct();
				
}
	
@PutMapping("/update/{id}")
	
public List<Product> updateProduct(@RequestBody Product pro,@PathVariable("id") int id)
{
	pro.setId(id);
		return service.updateProduct(pro);
		
		
}

@DeleteMapping("/delete/{id}")

	public List<Product> deleteProduct(@PathVariable("id") int id)
	{
	
	return service.deleteProduct(id);
	}
	
}
