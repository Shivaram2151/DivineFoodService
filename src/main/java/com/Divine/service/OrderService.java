package com.Divine.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.Divine.Exception.CartException;
import com.Divine.Exception.OrderException;
import com.Divine.Exception.RestaurantException;
import com.Divine.Exception.UserException;
import com.Divine.model.Order;
import com.Divine.model.PaymentResponse;
import com.Divine.model.User;
import com.Divine.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
