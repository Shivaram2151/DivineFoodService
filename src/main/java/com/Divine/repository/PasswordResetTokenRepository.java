package com.Divine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Divine.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
