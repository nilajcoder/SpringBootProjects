package com.springtips.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtips.entity.Product;

@RestController
public class ProductRestController {
	
	@PostMapping("/product")
	public String saveProduct(@RequestBody Product p) {
		
		//logic to persist
		System.out.println(p);
		
		return "Product Saved";
		
	}
	
	@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable Integer pid) {
		Product p=null;
		if(pid==100) {
			 p=new Product(100,"Mouse",500.0);
		} else if(pid==101) {
			 p=new Product(101,"HDD",600.0);
		}
			return p;
		}
	

	
	@GetMapping("/products")
	public List<Product> getProducts() {

	    Product p1 = new Product(100, "Mouse", 500.00);
	    Product p2 = new Product(101, "HD", 600.00);

	    List<Product> products = Arrays.asList(p1, p2);

	    return products;
	}

}
