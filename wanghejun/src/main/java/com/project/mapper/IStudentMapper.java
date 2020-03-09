package com.project.mapper;

import com.project.bean.StudentBean;
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
}
