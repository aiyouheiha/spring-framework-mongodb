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
