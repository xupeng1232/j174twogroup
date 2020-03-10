package com.project.dao;

import com.project.entity.UserEntity;

import java.util.List;

public interface IUserDao {

    public List<UserEntity> findAll(String userName);

}
