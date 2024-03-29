package com.Divine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Divine.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
