package com.project.service;

import com.project.bean.StudentBean;

import java.util.List;

public interface IStudentService {

    List<StudentBean> findAll();

    StudentBean findName(String name);

}
