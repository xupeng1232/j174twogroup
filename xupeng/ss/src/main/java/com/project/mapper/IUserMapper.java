package com.project.mapper;

import com.project.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface IUserMapper {
    @Insert("insert into t_user(pk_id,f_name,f_pwd,f_age)values(#{id},#{name},#{pwd},#{age})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int register(UserEntity userEntity);

}
