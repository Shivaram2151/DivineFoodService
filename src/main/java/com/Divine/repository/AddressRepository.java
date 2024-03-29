package com.Divine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Divine.model.Address;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    //List<Address> findAllByUserId(Long id);

}
