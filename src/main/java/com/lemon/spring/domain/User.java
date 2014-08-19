/* 
 * Copyright (c) 2014 General Electric Company. All rights reserved. 
 * 
 * The copyright to the computer software herein is the property of 
 * General Electric Company. The software may be used and/or copied only 
 * with the written permission of General Electric Company or in accordance 
 * with the terms and conditions stipulated in the agreement/contract 
 * under which the software has been supplied. 
 */
package com.lemon.spring.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
//    @Id
//    private String id;
    private String firstName;
    private String lastName;
}
