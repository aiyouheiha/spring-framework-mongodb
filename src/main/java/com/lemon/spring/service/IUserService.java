/* 
 * Copyright (c) 2014 General Electric Company. All rights reserved. 
 * 
 * The copyright to the computer software herein is the property of 
 * General Electric Company. The software may be used and/or copied only 
 * with the written permission of General Electric Company or in accordance 
 * with the terms and conditions stipulated in the agreement/contract 
 * under which the software has been supplied. 
 */
package com.lemon.spring.service;

import com.lemon.spring.domain.User;

import java.util.List;

public interface IUserService {
    User initUser();
    boolean saveUser(User user);
    List<User> getUserList();
    User getUserByFirstName(String firstName);
    void insertUser(User user);
}
