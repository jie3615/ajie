package com.ajie.user;

import com.ajie.api.UserService;
import com.ajie.model.User;
import org.apache.dubbo.config.annotation.Service;

import java.util.Random;
import java.util.UUID;

/**
 * @author: wyj
 * @date: 2019/11/25
 * @description:
 */
@Service(loadbalance = "random",cluster = "failsafe")
public class UserServiceImpl implements UserService{
    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("wyj" + UUID.randomUUID().toString().substring(0,8));
        user.setAge(new Random().nextInt(30));
        return user;
    }
}