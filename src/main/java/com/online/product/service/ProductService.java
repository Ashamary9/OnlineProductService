package com.online.product.service;

import java.util.List;
import java.util.Optional;

import com.online.product.model.Product;



public interface ProductService {

	public List<Product> getallProducts();
	public Product addProduct(Product product);
	public Product updateProduct(Product product,long productId);
	public Optional<Product> getProductById(long productId);
	public void deleteProductById(long productId);
	
	
}
