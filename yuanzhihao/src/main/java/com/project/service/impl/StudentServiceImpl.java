package com.project.service.impl;

import com.project.bean.StudentBean;
import com.project.mapper.IStudentMapper;
import com.project.service.IStudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentMapper mapper;

    @Override
    public void add(StudentBean student) {
        mapper.add(student);
    }

    @Override
    public void del(int id) {
        mapper.del(id);
    }

    @Override
    public void update(int id, String phone) {
        mapper.update(id,phone);
    }

    @Override
    public List<StudentBean> findAll() {
        return mapper.findAll();
    }
}
