package com.project.mapper;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IStudentMapper {
    @Insert("insert into t_student (f_name,f_phone)values(#{name},#{phone})")
    public void add(StudentEntity studentEntity);
    @Select("select pk_id id,f_name name,f_phone phone from t_student")
    public List<StudentEntity> findAll();
    @Delete("delete from t_student where pk_id=#{id}")
    public void del(int id);
    @Update("update t_student set f_phone = #{arg1} where pk_id=#{arg0}")
    public void update(int id,String phone);

}
