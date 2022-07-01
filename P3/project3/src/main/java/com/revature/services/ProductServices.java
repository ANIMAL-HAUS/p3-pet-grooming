package com.revature.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Categories;
import com.revature.models.Product;
import com.revature.repository.ProductDAO;


@Service
public class ProductServices {
	private static ProductDAO pd;

	@Autowired
	public ProductServices() {
		super();
		
	}
//	public ProductServices(Product product) {
//		pd.getByProductName(product.getgName());
//				
//	}
	
	



public static List<Product> getAllProducts(){
	return ProductDAO.getAllProducts();
}

public static Product getProductById(int id) {
	return ProductDAO.getProductById(id);	
}

public List<Product> getAllUsers() {
	return ProductDAO.getAllProducts();
}
public static Product getByProductCategories(Categories productType) {
	return ProductDAO.getByProductCategory(productType);
}
public static void insertProduct(Product product) {
	 ProductDAO.insertProduct(product);
	
}
}
