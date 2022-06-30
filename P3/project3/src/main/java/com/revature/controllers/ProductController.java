package com.revature.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.models.Categories;
import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.services.ProductServices;
import com.revature.services.UserServices;
@Controller
@RequestMapping(value="/productcontroller")
@CrossOrigin
public class ProductController {
	private ProductServices ps;
	public ProductController(ProductServices product) {
		ps = product;
	}
	
	
//	@PostMapping("/insertProductWalking")
//	public static ResponseEntity<Product> insertProductWalking(@RequestBody Product product){
//		System.out.println(product.getId());
//		
//		if(product.getProductType() == null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
//		}else {
//			product.setProductType(Categories.Walking);
//			ProductServices.insertProduct(product);
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
//		}	
//	}
//	@PostMapping("/insertProductSitting ")
//	public static ResponseEntity<Product> insertProductSitting(@RequestBody Product product){
//		System.out.println(product.getId());
//		
//		if(product.getProductType() == null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
//		}else {
//			product.setProductType(Categories.Sitting);
//			ProductServices.insertProduct(product);
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
//		}	
//	}
//		@PostMapping("/insertProductGrooming ")
//		public static ResponseEntity<Product> insertProductGrooming(@RequestBody Product product){
//			System.out.println(product.getId());
//			
//			if(product.getProductType() == null) {
//				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
//			}else {
//				product.setProductType(Categories.Grooming);
//				ProductServices.insertProduct(product);
//				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
//			}	
//	}
	@PostMapping("/getProductByID")
	public static ResponseEntity<Product> getProductByID(@RequestBody int id){
		Product p = new Product();
		p = ProductServices.getProductById(id);
		 ResponseEntity.status(HttpStatus.CREATED).body(p);
		 return ResponseEntity.status(200).body(p);
	}
}
