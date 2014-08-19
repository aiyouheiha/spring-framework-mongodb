/* 
 * Copyright (c) 2014 General Electric Company. All rights reserved. 
 * 
 * The copyright to the computer software herein is the property of 
 * General Electric Company. The software may be used and/or copied only 
 * with the written permission of General Electric Company or in accordance 
 * with the terms and conditions stipulated in the agreement/contract 
 * under which the software has been supplied. 
 */
package com.lemon.spring.controller;

import com.lemon.spring.domain.User;
import com.lemon.spring.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginController {

    @Resource
    private IUserService userService;

    @RequestMapping("/login")
    public String login(Model model) {
        User user = userService.initUser();
        model.addAttribute(user);
        return "login";
    }

    @RequestMapping("/signin")
    public String signin(User user,
                         Model model) {
//        userService.saveUser(user);
        userService.insertUser(user);
//        User savedUser = userService.getUserByFirstName(user.getFirstName());
        model.addAttribute("firstName", user.getFirstName());
        return "greeting";
    }

    @RequestMapping("/user_list")
    public String userList(Model model) {
        List<User> userList = userService.getUserList();
        model.addAttribute("userList", userList);
        return "user_list";
    }
}
