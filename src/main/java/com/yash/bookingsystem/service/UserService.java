package com.yash.bookingsystem.service;

import com.yash.bookingsystem.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}