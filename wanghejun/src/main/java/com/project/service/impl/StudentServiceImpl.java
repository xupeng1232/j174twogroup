package com.project.service.impl;

import com.project.bean.StudentBean;
import com.project.mapper.IStudentMapper;
import com.project.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentMapper studentMapper;

    @Override
    public List<StudentBean> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public StudentBean findName(String name) {
       return studentMapper.findName(name);
    }


}
