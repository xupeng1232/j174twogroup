package com.project.mapper;

import com.project.bean.UserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserMapper {
    public List<UserBean> findByName();

    @Insert("insert into t_user(f_name,f_pwd,f_age)values(#{name},#{pwd},#{age})")
    public void add(UserBean user);

    public UserBean find(String name);
}
