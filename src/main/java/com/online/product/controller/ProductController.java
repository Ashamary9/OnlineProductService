package com.online.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.product.model.Product;
import com.online.product.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductService proser;
	
	

     @GetMapping("/getallproducts") 
	public List<Product> getallProductsInfo() {
		
		return proser.getallProducts();
	}

	
     @PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {

		return proser.addProduct(product);
	}

	
     
     @PutMapping("/updateProduct/{productId}")
	public Product updateProduct(@RequestBody Product product,@PathVariable long productId) {
		
		
		return proser.updateProduct(product, productId);
		}
		
		
		
	@GetMapping("/getProductByid/{productId}")
	public Optional<Product> getProductById(@PathVariable long productId) {

		return proser.getProductById(productId);
	}

	
	
	@DeleteMapping("/deleteproductByid/{productId}")
	public void deleteProductById(@PathVariable long productId) {

		proser.deleteProductById(productId);
	}
	
	
}
