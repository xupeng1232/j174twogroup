package com.project.dao;

import com.project.bean.UserBean;

import java.util.List;

public interface IUserDao {
    public List<UserBean> findAll();
}
