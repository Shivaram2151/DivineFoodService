package com.Divine.service;

import java.util.List;

import com.Divine.model.Notification;
import com.Divine.model.Order;
import com.Divine.model.Restaurant;
import com.Divine.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
