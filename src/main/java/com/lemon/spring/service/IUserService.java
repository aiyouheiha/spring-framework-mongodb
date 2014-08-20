package com.lemon.spring.service;

import com.lemon.spring.domain.User;

import java.util.List;

public interface IUserService {
    User initUser();
    boolean saveUser(User user);
    List<User> getUserList();
    List<User> getUserListByFirstName(String firstName);
    User getUserByFirstName(String firstName);
    void insertUser(User user);
}
