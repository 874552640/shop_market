package com.ycc.market.service.impl;


import com.ycc.market.dao.UserDao;
import com.ycc.market.entity.User;
import com.ycc.market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User userRegister(User user) {
        int i = userDao.insertUser(user);
        if (i>0){
            return user;
        }else {
            return null;
        }

    }
}
