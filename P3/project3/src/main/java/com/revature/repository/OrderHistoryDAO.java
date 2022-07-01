package com.revature.repository;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.OrderHistory;
import com.revature.utilities.HibernateUtil;

public class OrderHistoryDAO{
	public List<OrderHistory> getAllOrderHistory(){
		try(Session ses = HibernateUtil.getSession()){
			List<OrderHistory> movieList = ses.createQuery("FROM OrderHistory").list();
			HibernateUtil.closeSession();
			return movieList;
		}
		catch(HibernateException e) {
			System.out.println("There was an error getting all WishList");
			return null;
		}
	}
	public OrderHistory getOrderHistoryByOrderHistoryId(int orderId){
		try(Session ses = HibernateUtil.getSession()){
			OrderHistory movie = ses.get(OrderHistory.class, orderId);
			HibernateUtil.closeSession();
			return movie;
		}
		catch(HibernateException e) {
			System.out.println("There was an error getting OrderHistory by WishList Id");
			return null;
		}
	}
	public List<OrderHistory> getOrderHistoryByUserId(int id){
		try(Session ses = HibernateUtil.getSession()){
			Query q = ses.createQuery("FROM WishList p WHERE p.user.user_id = ?0");
			q.setParameter(0, id);
			List<OrderHistory> movieList = q.getResultList();
			HibernateUtil.closeSession();
			return movieList;
		}
		catch(HibernateException e) {
			System.out.println("There was an error getting OrderHistory by User Id");
			return null;
		}
		
	}
	public List<OrderHistory> getOrderHistoryProductId(int product){
		try(Session ses = HibernateUtil.getSession()){
			Query q = ses.createQuery("FROM WishList p WHERE p.pokemon_id = ?0");
			q.setParameter(0, product);
			List<OrderHistory> movieList = q.getResultList();
			HibernateUtil.closeSession();
			return movieList;
		}
		catch(HibernateException e) {
			System.out.println("There was an error getting Order History by product Id");
			return null;
		}
	}
//	public int insertproduct( OrderHistory or) {
//		try(Session ses = HibernateUtil.getSession()){
//			ses.save(or);
//			HibernateUtil.closeSession();
//			return 1;
//		}
//		catch(HibernateException e) {
//			System.out.println("There was an error inserting into the WishList");
//			return 0;
//		}
//	}
	public int updateOrderHistory(OrderHistory or) {
		try(Session ses = HibernateUtil.getSession()){
			Transaction tran = ses.beginTransaction();
			ses.merge(or);
			tran.commit();
			HibernateUtil.closeSession();
			return 1;
		}
		catch(HibernateException e) {
			System.out.println("There was an error updating the OrderHistory");
			return 0;
		}
	}
	public int deleteOrderHistory(int id) {
		try(Session ses = HibernateUtil.getSession()){
			Transaction tran = ses.beginTransaction();
			OrderHistory or = new OrderHistory();
			or.setOrderId(id);
			ses.delete(or);
			tran.commit();
			HibernateUtil.closeSession();
			return 1;
		}
		catch(HibernateException e) {
			System.out.println("There was an error updating the WishList");
			return 0;
		}
	}
}
