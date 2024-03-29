package com.Divine.service;

import java.util.List;

import com.Divine.Exception.FoodException;
import com.Divine.Exception.RestaurantException;
import com.Divine.model.Category;
import com.Divine.model.Food;
import com.Divine.model.Restaurant;
import com.Divine.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
