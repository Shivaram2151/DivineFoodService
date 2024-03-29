package com.Divine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Divine.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
