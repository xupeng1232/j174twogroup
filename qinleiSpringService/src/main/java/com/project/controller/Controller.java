package com.project.controller;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private IUserService service;

    @RequestMapping("getUser")
    public List<UserEntity> getUser(String userName){
        return service.findAll(userName);
    }

    @RequestMapping("testlovo")
    public String test(){
        return "test";
    }
}
