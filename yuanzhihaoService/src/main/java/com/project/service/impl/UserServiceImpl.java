package com.project.service.impl;

import com.project.bean.UserBean;
import com.project.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private  IUserMapper mapper;

    @Override
    public List<UserBean> findByName( ) {
        return mapper.findByName();
    }

    @Override
    public void add(UserBean user) {
        mapper.add(user);
    }

    @Override
    public UserBean find(String name) {
        return mapper.find(name);
    }
}
