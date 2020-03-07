package com.project.service.impl;

import com.project.entity.StudentEntity;
import com.project.mapper.IStudentMapper;
import com.project.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentServiceImpl implements IStudentService {

    @Resource
    private IStudentMapper mapper;
    @Override
    public void add(StudentEntity studentEntity) {
    mapper.add(studentEntity);
    }

    @Override
    public List<StudentEntity> findAll() {
        return mapper.findAll();
    }

    @Override
    public void del(int id) {
        mapper.del(id);
    }

    @Override
    public void update(int id, String phone) {
    mapper.update(id,phone);
    }

}
