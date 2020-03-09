package com.project.controller;

import com.project.bean.StudentBean;
import com.project.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private IStudentService service;

    @RequestMapping("/findName.test")
    public StudentBean findName(@RequestParam("name") String name){
        System.out.println(name);
        return service.findName(name);
    }
}
