package com.project.service;

import com.project.bean.StudentBean;

import java.util.List;

public interface IStudentService {

     void add(StudentBean student);

     List<StudentBean> findAll();

     void delStu(int id);

     void updateStud(int id,String name,String phone);
}
