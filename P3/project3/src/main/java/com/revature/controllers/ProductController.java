package com.revature.controllers;
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
	@PostMapping("/insertProductConsole")
	public static ResponseEntity<Product> insertProductConsole(@RequestBody Product product){
		System.out.println(product.getId());
		
		if(product.getgName() == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
		}else {
			product.setProduct(Categories.Console);
			ProductServices.insertProduct(product);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
		}	
	}
	@PostMapping("/insertProductControllers")
	public static ResponseEntity<Product> insertProductController(@RequestBody Product product){
		System.out.println(product.getId());
		
		if(product.getgName() == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
		}else {
			product.setProduct(Categories.Controllers);
			ProductServices.insertProduct(product);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
		}	
	}
	@PostMapping(" ")
	public static ResponseEntity<Product> insertProductGames(@RequestBody Product product){
		System.out.println(product.getId());
		
		if(product.getgName() == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
		}else {
			product.setProduct(Categories.Games);
			ProductServices.insertProduct(product);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
		}	
	}
	@PostMapping("/getProductByID")
	public static ResponseEntity<Product> getProductByID(@RequestBody int id){
		Product p = new Product();
		p = ProductServices.getProductById(id);
		 ResponseEntity.status(HttpStatus.CREATED).body(p);
		 return ResponseEntity.status(200).body(p);
	}
}
