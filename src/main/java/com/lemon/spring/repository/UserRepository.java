package com.lemon.spring.repository;

import com.lemon.spring.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String>, QueryDslPredicateExecutor<User> {
    List<User> findByFirstName(String firstName);
}
