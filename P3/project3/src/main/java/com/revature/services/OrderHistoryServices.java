package com.revature.services;

import java.util.List;

import com.revature.models.OrderHistory;
import com.revature.repository.OrderHistoryDAO;

public class OrderHistoryServices {
	OrderHistoryDAO or = new OrderHistoryDAO();
	
	public List<OrderHistory> getAllOrderHistory() throws Exception {
		List<OrderHistory> result = or.getAllOrderHistory();
		if(result.get(0).getOrderId() != 0) {
			return result;
		}
		else {
			throw new Exception();
		}
	}
	public OrderHistory getOrderHistoryByOrderHistoryId(int orderId) throws Exception {
		OrderHistory result = or.getOrderHistoryByOrderHistoryId(orderId);
		if(result.getOrderId() != 0) {
			return result;
		}
		else {
			throw new Exception();
		}
	}
	public List<OrderHistory> getOrderHistoryByUserId(int id) throws Exception {
		List<OrderHistory> result = or.getOrderHistoryByUserId(id);
		if(result.get(0).getOrderId() != 0) {
			return result;
		}
		else {
			throw new Exception();
		}
	}
	public List<OrderHistory> getOrderHistoryByProductId(int id) throws Exception {
		List<OrderHistory> result = or.getOrderHistoryProductId(id);
		if(result.get(0).getOrderId() != 0) {
			return result;
		}
		else {
			throw new Exception();
		}
	}
//	public void insertOrderHistory(OrderHistory orderhistory) throws Exception {
//		int result = or.);
//		if(result == 0) {
//			throw new Exception();
//		}
//	}
	public void updateOrderList(OrderHistory orderhistory) throws Exception {
		int result = or.updateOrderHistory(orderhistory);
		if(result == 0) {
			throw new Exception();
		}
	}
	public void deleteOrderHistory(int id) throws Exception {
		int result = or.deleteOrderHistory(id);
		if (result == 0) {
			throw new Exception();
		}
	}
}

