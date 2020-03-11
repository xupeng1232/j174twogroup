package com.project.service.impl;

import com.project.entity.UserEntity;
import com.project.mapper.IUserMapper;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper mapper;
    @Override
    public int register(UserEntity userEntity) {
        mapper.register(userEntity);
        int userId=userEntity.getId();
        return userId;
    }
}
