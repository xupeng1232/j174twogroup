package com.project.service.impl;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<UserBean> findAll() {
        return userDao.findAll();
    }
}
