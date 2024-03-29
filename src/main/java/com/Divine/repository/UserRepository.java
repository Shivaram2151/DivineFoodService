package com.Divine.repository;

import java.util.List;

import com.Divine.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Divine.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
	@Query("SELECT u FROM User u Where u.status='PENDING'")
	public List<User> getPenddingRestaurantOwners();
	
	public User findByEmail(String username);


	List<Address> findAddressesById(Long userId);
}
