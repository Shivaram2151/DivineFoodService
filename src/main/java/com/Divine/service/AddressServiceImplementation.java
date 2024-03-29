package com.Divine.service;

import com.Divine.model.User;
import com.Divine.repository.AddressRepository;
import com.Divine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImplementation implements AddressService{

    @Autowired
    private AddressRepository addressRepository;


    @Autowired
    private UserRepository userRepository;

    @Override
    public String deleteAddressById(Long id) {

        addressRepository.deleteById(id);
        return "deleted success";
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }
}
