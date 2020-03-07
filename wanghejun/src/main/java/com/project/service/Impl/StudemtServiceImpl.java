package com.project.service.Impl;

import com.project.bean.StudentBean;
import com.project.mapper.IStudentMapper;
import com.project.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudemtServiceImpl implements IStudentService {

    @Resource
    private IStudentMapper mapper;

    public void add(StudentBean student) {
        mapper.add(student);
    }

    public List<StudentBean> findAll() {
        return mapper.findAll();
    }

    @Override
    public void delStu(int id) {
        mapper.delStu(id);
    }

    @Override
    public void updateStud(int id, String name, String phone) {
        mapper.updateStud(id,name,phone);
    }

}
