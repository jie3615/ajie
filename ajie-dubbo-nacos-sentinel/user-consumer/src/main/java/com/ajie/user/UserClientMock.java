package com.ajie.user;

import com.ajie.api.UserService;
import com.ajie.model.User;

/**
 * @author: wyj
 * @date: 2019/11/25
 * @description:
 */
public class UserClientMock implements UserService {
    @Override
    public User getUser(Long id) {

        User user = new User();
        user.setName("被熔断");
        return  user;
    }
}