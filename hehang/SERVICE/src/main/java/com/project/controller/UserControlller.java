package com.project.controller;
import com.project.bean.UserBean;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserControlller {

    @Autowired
    private IUserService service;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UserBean> findAll(){
        return service.findAll();
        //return Arrays.asList(new UserBean("丽丽", "777", 20),new UserBean("kk", "55", 22));
    }


    @RequestMapping("one")
    @ResponseBody
    public UserBean one(){
        //return new UserBean("丽丽", "777", 21);
        return service.findById(13);
    }
}
