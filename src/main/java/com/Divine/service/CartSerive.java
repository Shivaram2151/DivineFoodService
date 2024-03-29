package com.Divine.service;

import com.Divine.Exception.CartException;
import com.Divine.Exception.CartItemException;
import com.Divine.Exception.FoodException;
import com.Divine.Exception.UserException;
import com.Divine.model.Cart;
import com.Divine.model.CartItem;
import com.Divine.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
