package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productrepository;

	public List<Product> getProduct() {
		return productrepository.findAll();
	}

	public Product getProductById(Long id) {
		return productrepository.getById(id);
	}

	public Product saveProduct(Product product) {
		return productrepository.save(product);
	}

	public void deleteProduct(Long id) {
		productrepository.deleteById(id);
	}

}
