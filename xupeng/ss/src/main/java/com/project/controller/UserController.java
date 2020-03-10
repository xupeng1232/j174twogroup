package com.project.controller;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService service;
    @RequestMapping("register.lovo")
    public String register(UserEntity userEntity){
        String userId= String.valueOf(service.register(userEntity));
        System.out.println(userId);
        return userId;
    }
}
