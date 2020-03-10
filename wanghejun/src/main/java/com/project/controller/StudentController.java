package com.project.controller;

import com.project.bean.StudentBean;
import com.project.bean.UserBean;
import com.project.bean.UserInfoBean;
import com.project.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private IStudentService service;

    @RequestMapping("/findName.test")
    public StudentBean findName(@RequestParam("name") String name){
        System.out.println(name);
        return service.findName(name);
    }

    @RequestMapping("addUser.test")
    public void addUser(UserBean user){
        service.addUser(user);
        service.addUserInfo(new UserInfoBean());
    }
}
