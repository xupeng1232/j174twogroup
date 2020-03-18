package com.project;

import com.project.bean.UserBean;
import com.project.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;


public class UserTest {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        IUserService userService = (IUserService) context.getBean("userServiceImpl");
        List<UserBean> userBeanList = userService.findAll();
        for (UserBean user:userBeanList
             ) {
            System.out.println("id"+user.getId()+" 名字："+user.getUserName()+" 密码："+user.getPassword()+" 年龄："+user.getAge());
        }
    }
}
