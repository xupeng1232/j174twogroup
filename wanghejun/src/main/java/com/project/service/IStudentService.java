package com.project.service;

import com.project.bean.StudentBean;
import com.project.bean.UserBean;
import com.project.bean.UserInfoBean;

import java.util.List;

public interface IStudentService {

    List<StudentBean> findAll();

    StudentBean findName(String name);

    void addUser(UserBean user);

    void addUserInfo(UserInfoBean userInfo);

}
