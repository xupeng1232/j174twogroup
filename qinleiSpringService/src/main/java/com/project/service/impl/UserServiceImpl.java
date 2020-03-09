package com.project.service.impl;


import com.project.dao.IUserDao;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
//    @Resource
    private IUserDao userDao;

    @Override
    public List<UserEntity> findAll(String name) {
        return userDao.findAll(name);
    }

}
