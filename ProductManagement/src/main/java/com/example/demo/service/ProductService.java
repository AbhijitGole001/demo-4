package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepository;


@Service
public class ProductService {

	@Autowired
	ProductRepository pr;
	
	public void addProduct(Product p)
	
	{
		
		pr.save(p);
		
	}
}
