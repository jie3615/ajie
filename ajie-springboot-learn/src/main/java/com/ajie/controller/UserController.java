package com.ajie.controller;

import com.ajie.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wyj
 * @date: 2019/11/25
 * @description:
 */
@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setName("wyj");
        user.setAge(26);
        return user;
    }
}