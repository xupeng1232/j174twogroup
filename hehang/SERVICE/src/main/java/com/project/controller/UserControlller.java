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
    }


    @RequestMapping("one")
    @ResponseBody
    public UserBean one(){

        return service.findById(13);
    }
}
