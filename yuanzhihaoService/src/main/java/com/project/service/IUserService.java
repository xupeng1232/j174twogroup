package com.project.service;

import com.project.bean.UserBean;

import java.util.List;

public interface IUserService {
    public List<UserBean> findByName();

    public void add(UserBean user);


    public UserBean getUserByName(String userName);

}
