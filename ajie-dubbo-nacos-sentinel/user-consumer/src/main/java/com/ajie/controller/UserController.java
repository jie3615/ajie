package com.ajie.controller;

import com.ajie.model.User;
import com.ajie.user.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wyj
 * @date: 2019/11/25
 * @description:
 */
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable(name = "id") Long id) {
        return userClient.getUserById(id);
    }
}