package com.project.service;

import com.project.bean.UserBean;

import java.util.List;

public interface IUserService {

    public List<UserBean> findAll();

    public UserBean findById(int id);
}
