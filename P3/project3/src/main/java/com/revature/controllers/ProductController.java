package com.revature.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.models.Categories;
import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.services.ProductServices;
import com.revature.services.UserServices;
@Controller
@ResponseBody
@RequestMapping(value="/productController")
@CrossOrigin
public class ProductController {
	Product p;
	public ProductServices ps;
	
	@Autowired
	public ProductController(ProductServices service) {
		this.ps =service;
	}

	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Product> getAllProducts(){
		return ProductServices.getAllProducts();
	}
	
//	public ProductController(ProductServices product) {
//		ps = product;
//	}
	
	@PostMapping("/insertProductWalking")
	public static ResponseEntity<Product> insertProductWalking(@RequestBody Product product){
		System.out.println(product.getId());
		
		
			product.setProduct(Categories.Walking);
			ProductServices.insertProduct(product);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
			
	}
	@PostMapping("/insertProductDayCare")
	public static ResponseEntity<Product> insertProductController(@RequestBody Product product){
		System.out.println(product.getId());
		
		
		product.setProduct(Categories.DayCare);
		ProductServices.insertProduct(product);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
			
	}
	@PostMapping("/insertProductGrooming")
	public static ResponseEntity<Product> insertProductGames(@RequestBody Product product){
		
		
		
		product.setProduct(Categories.Grooming);
		ProductServices.insertProduct(product);
		System.out.println(product.getId());
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
			
	}
	

}