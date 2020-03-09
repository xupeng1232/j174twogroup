package com.project.service;

import com.project.entity.UserEntity;

import java.util.List;

public interface IUserService {
    public List<UserEntity> findAll(String name);
}
