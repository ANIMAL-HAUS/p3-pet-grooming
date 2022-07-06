package com.revature.models;

import java.util.Date;
import java.util.List;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Order History")
 public class OrderHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	@Enumerated(EnumType.STRING)
	private Categories productType;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false)
	private User user;
	
	public OrderHistory(int orderId, Categories productType, User user) {
		super();
		this.orderId = orderId;
		this.productType = productType;
		this.user = user;
	}

	public OrderHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Categories getProduct() {
		return productType;
	}

	public void setProduct(Categories productType) {
		this.productType = productType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, productType, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderHistory other = (OrderHistory) obj;
		return orderId == other.orderId && productType == other.productType && Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		return "OrderHistory [orderId=" + orderId + ", product=" + productType + ", user=" + user + "]";
	}
	
}