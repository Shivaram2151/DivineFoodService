package com.Divine.service;

import com.Divine.model.User;

import java.util.Optional;

public interface AddressService {

    public String deleteAddressById(Long id) throws Exception;

    public Optional<User> getUser(Long id);

}
