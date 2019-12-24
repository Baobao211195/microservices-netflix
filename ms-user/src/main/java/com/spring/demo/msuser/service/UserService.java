package com.spring.demo.msuser.service;

import com.spring.demo.msuser.entity.User;

public interface UserService{
    User registerUser(User input);
    Iterable<User> findAll();
}
