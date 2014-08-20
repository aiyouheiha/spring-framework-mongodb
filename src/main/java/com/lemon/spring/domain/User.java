package com.lemon.spring.domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class User {
//    @Id
//    private String id;
    private String firstName;
    private String lastName;
}
