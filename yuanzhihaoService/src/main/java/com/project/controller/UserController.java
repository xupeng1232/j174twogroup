package com.project.controller;

import com.project.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.service.IUserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService service;

    @RequestMapping("getUserList.lovo")
    public List<UserBean> findByName(String name){

        return service.findByName();
    };

    @RequestMapping("{userName}/find.lovo")
    public UserBean  getUserByName(@PathVariable("userName") String userName){

        return service.find(userName);
    }


    @RequestMapping("addUser.lovo")
    public String addUser(UserBean user){
       try {
           service.add(user);
       }catch (Exception e){
           e.printStackTrace();
       }
        //保存到数据库。。。。。
        return "ok";
    }

}
