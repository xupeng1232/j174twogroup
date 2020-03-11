package com.project.service.impl;
import com.project.bean.UserBean;
import com.project.mapper.IUserMapper;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper mapper;

    @Override
    public List<UserBean> findAll() {
        return mapper.findAll();
    }

    @Override
    public UserBean findById(int id) {
        return mapper.findById(id);
    }
}
