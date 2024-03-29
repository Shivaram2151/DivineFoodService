package com.Divine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Divine.Exception.CartException;
import com.Divine.Exception.CartItemException;
import com.Divine.Exception.FoodException;
import com.Divine.Exception.UserException;
import com.Divine.model.Cart;
import com.Divine.model.CartItem;
import com.Divine.model.User;
import com.Divine.request.AddCartItemRequest;
import com.Divine.request.UpdateCartItemRequest;
import com.Divine.service.CartSerive;
import com.Divine.service.UserService;

@RestController
@RequestMapping("/api")
public class CartController {
	@Autowired
	private CartSerive cartService;
	@Autowired
	private UserService userService;

	@PutMapping("/cart/add")
	public ResponseEntity<CartItem> addItemToCart(@RequestBody AddCartItemRequest req,
			@RequestHeader("Authorization") String jwt) throws UserException, FoodException, CartException, CartItemException {
		CartItem cart = cartService.addItemToCart(req, jwt);
		return ResponseEntity.ok(cart);

	}

	@PutMapping("/cart-item/update")
	public ResponseEntity<CartItem> updateCartItemQuantity(
			@RequestBody UpdateCartItemRequest req, 
			@RequestHeader("Authorization") String jwt) throws CartItemException {
		CartItem cart = cartService.updateCartItemQuantity(req.getCartItemId(), req.getQuantity());
		return ResponseEntity.ok(cart);
	}

	@DeleteMapping("/cart-item/{id}/remove")
	public ResponseEntity<Cart> removeItemFromCart(@PathVariable Long id,
			@RequestHeader("Authorization") String jwt) throws UserException, CartException, CartItemException {

		Cart cart = cartService.removeItemFromCart(id, jwt);
		return ResponseEntity.ok(cart);

	}

	@GetMapping("/cart/total")
	public ResponseEntity<Double> calculateCartTotals(@RequestParam Long cartId,
			@RequestHeader("Authorization") String jwt) throws UserException, CartException {

		
		User user = userService.findUserProfileByJwt(jwt);
		
		Cart cart =cartService.findCartByUserId(user.getId());
		double total = cartService.calculateCartTotals(cart);
		return ResponseEntity.ok(total);
	}
	
	@GetMapping("/cart/")
	public ResponseEntity<Cart> findUserCart(
			@RequestHeader("Authorization") String jwt) throws UserException, CartException {
User user=userService.findUserProfileByJwt(jwt);
		Cart cart = cartService.findCartByUserId(user.getId());
		return ResponseEntity.ok(cart);
	}
	
	@PutMapping("/cart/clear")
	public ResponseEntity<Cart> cleareCart(
			@RequestHeader("Authorization") String jwt) throws UserException, CartException {
User user=userService.findUserProfileByJwt(jwt);
		Cart cart = cartService.clearCart(user.getId());
		return ResponseEntity.ok(cart);
	}

}
