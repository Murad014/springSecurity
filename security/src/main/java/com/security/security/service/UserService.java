package com.security.security.service;

import com.security.security.entity.User;

import java.util.Optional;

public interface UserService {

    User findByUsername(String username);


}
