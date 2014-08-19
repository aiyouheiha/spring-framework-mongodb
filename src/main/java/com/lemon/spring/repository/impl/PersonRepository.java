/* 
 * Copyright (c) 2014 General Electric Company. All rights reserved. 
 * 
 * The copyright to the computer software herein is the property of 
 * General Electric Company. The software may be used and/or copied only 
 * with the written permission of General Electric Company or in accordance 
 * with the terms and conditions stipulated in the agreement/contract 
 * under which the software has been supplied. 
 */
package com.lemon.spring.repository.impl;

import com.lemon.spring.domain.User;
import com.lemon.spring.repository.IPersonRepository;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class PersonRepository implements IPersonRepository {

    @Resource
    private MongoOperations mongoTemplate;

    @Override
    public void insert(User user) {
        mongoTemplate.insert(user);
    }
}
