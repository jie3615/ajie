package com.ajie.user;

import com.ajie.api.UserService;
import com.ajie.model.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author: wyj
 * @date: 2019/11/25
 * @description:
 */
@Service
public class UserClient {
    @Reference(loadbalance = "roundrobin",cluster = "failfast",check = false,mock = "com.ajie.user.UserClientMock")
    private UserService userService;

    public User getUserById(Long id) {

        return userService.getUser(id);
    }
}