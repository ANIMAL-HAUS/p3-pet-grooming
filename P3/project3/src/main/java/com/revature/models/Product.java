package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Enumerated(EnumType.STRING)
	private Categories productType;
	@Column(nullable = false, unique=true)
    private String Description;
	@Column(nullable = false)
	private Double price;
	
	
	
	public Product(String description, Double price) {
		super();
		Description = description;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, Categories productType, String description, Double price) {
		super();
		this.id = id;
		this.productType = productType;
		Description = description;
		this.price = price;
		
	}
	public Product(Categories productType, String description, Double price) {
		super();

		this.productType = productType;
		Description = description;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categories getProductType() {
		return productType;
	}

	public void setProduct(Categories productType) {
		this.productType = productType;
	}
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

	@Override
	public int hashCode() {

		return Objects.hash(Description, id, price, productType);

	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;

		return Objects.equals(Description, other.Description)  && id == other.id
				&& Objects.equals(price, other.price) && productType == other.productType;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", product=" + productType + ", Description=" + Description + ", price=" + price + "]";

	}
	

}

