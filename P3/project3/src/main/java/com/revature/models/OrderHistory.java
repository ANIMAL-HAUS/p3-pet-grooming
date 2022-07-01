package com.revature.models;

import java.util.Date;
import java.util.List;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "OrderHistory")
public class OrderHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private Categories product;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private User user;
	
	public OrderHistory(int orderId, Categories product, User user) {
		super();
		this.orderId = orderId;
		this.product = product;
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
		return product;
	}

	public void setProduct(Categories product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, product, user);
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
		return orderId == other.orderId && product == other.product && Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		return "OrderHistory [orderId=" + orderId + ", product=" + product + ", user=" + user + "]";
	}
	
}