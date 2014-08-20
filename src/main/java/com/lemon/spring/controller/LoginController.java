package com.lemon.spring.controller;

import com.lemon.spring.domain.User;
import com.lemon.spring.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String userList(Model model, @RequestParam(required = false, value = "q", defaultValue = "") String q) {
        List<User> userList;
        if (q == "") {
            userList = userService.getUserList();
        } else {
            userList = userService.getUserListByFirstName(q);
        }
        model.addAttribute("userList", userList);
        return "user_list";
    }
}
