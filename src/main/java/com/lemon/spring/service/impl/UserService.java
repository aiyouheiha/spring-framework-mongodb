/* 
 * Copyright (c) 2014 General Electric Company. All rights reserved. 
 * 
 * The copyright to the computer software herein is the property of 
 * General Electric Company. The software may be used and/or copied only 
 * with the written permission of General Electric Company or in accordance 
 * with the terms and conditions stipulated in the agreement/contract 
 * under which the software has been supplied. 
 */
package com.lemon.spring.service.impl;

import com.lemon.spring.domain.User;
import com.lemon.spring.repository.UserRepository;
import com.lemon.spring.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User initUser() {
        User user = new User();
        user.setFirstName("service firstname");
        user.setLastName("service lastname");
        return user;
    }

    @Override
    public boolean saveUser(User user) {
        User u = userRepository.save(user);
        if (u != null) {
            return true;
        }
        return false;
    }
}
