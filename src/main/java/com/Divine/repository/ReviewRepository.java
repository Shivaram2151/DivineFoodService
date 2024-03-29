package com.Divine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Divine.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
