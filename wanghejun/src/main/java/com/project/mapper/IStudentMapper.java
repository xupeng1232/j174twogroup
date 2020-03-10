package com.project.mapper;

import com.project.bean.StudentBean;
import com.project.bean.UserBean;
import com.project.bean.UserInfoBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStudentMapper {

    @Insert("insert into t_student(f_name,f_phone) values(#{name},#{phone})")
    void add(StudentBean student);

    @Select("select * from t_student")
    @ResultMap("studentMap")
    List<StudentBean> findAll();

    @Delete("delete  from t_student where pk_id=#{id}")
    void delStu(int id);

    @Update("update t_student set f_name=#{name},f_phone=#{phone} where pk_id=#{id}")
    void updateStud(int id, String name, String phone);

    @Select("select * from t_student where f_name = #{name}")
    @ResultMap("studentMap")
    StudentBean findName(@Param("name") String name);

    @Insert("insert into t_user(f_userName,f_password,f_age) values(#{name},#{psd},#{age})")
    void addUser(UserBean user);

    @Insert("insert into t_userInfo(f_post,f_wage,f_cgTime) values(#{post},#{wage},now())")
    void addUserInfo(UserInfoBean userInfo);
}
