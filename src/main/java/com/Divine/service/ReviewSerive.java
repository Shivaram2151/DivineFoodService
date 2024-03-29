package com.Divine.service;

import java.util.List;

import com.Divine.Exception.ReviewException;
import com.Divine.model.Review;
import com.Divine.model.User;
import com.Divine.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
