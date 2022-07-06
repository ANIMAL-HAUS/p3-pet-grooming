package com.revature.models;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Cart")
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
ArrayList<Product> services;
String username;


public Cart() {
	super();
	// TODO Auto-generated constructor stub
}

public Cart(ArrayList<Product> services, String username) {
	super();
	this.services = services;
	this.username = username;
}

public Cart(int id, ArrayList<Product> services, String username) {
	super();
	this.id = id;
	this.services = services;
	this.username = username;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public ArrayList<Product> getServices() {
	return services;
}
public void setServices(ArrayList<Product> services) {
	this.services = services;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

@Override
public int hashCode() {
	return Objects.hash(id, services, username);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cart other = (Cart) obj;
	return id == other.id && Objects.equals(services, other.services) && Objects.equals(username, other.username);
}

@Override
public String toString() {
	return "Cart [id=" + id + ", services=" + services + ", username=" + username + "]";
}

}


