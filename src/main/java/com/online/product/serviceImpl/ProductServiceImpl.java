package com.online.product.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.product.model.Product;
import com.online.product.repository.ProductRepository;
import com.online.product.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepository prorepo;
	
	
	@Override
	public List<Product> getallProducts() {
		
		return prorepo.findAll();
	}

	@Override
	public Product addProduct(Product product) {

		return prorepo.save(product);
	}

	@Override
	public Product updateProduct(Product product, long productId) {
		
		
		Optional<Product> pro=prorepo.findById(productId);
		
		if(pro.isPresent()) {
			Product p=pro.get();
			p.setProductName(product.getProductName());
			p.setProductType(product.getProductType());
			p.setProductImage(product.getProductImage());
			p.setProductDesc(product.getProductDesc());
			p.setProductPrice(product.getProductPrice());
			
			return prorepo.save(p);
		}
		else {

			return null;
		}
		
		
		
	}

	@Override
	public Optional<Product> getProductById(long productId) {

		return prorepo.findById(productId);
	}

	@Override
	public void deleteProductById(long productId) {

		prorepo.deleteById(productId);
		
	}

}
