package com.ycc.market.controller;

import com.ycc.market.dao.UserDao;
import com.ycc.market.entity.User;
import com.ycc.market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/hello")
    public String Hello(){
        return "Hello";
    }

    @RequestMapping("/register")
    public User getUser(User user){
        return userService.userRegister(user);
    }
}
