package com.project.mapper;
import com.project.bean.UserBean;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserMapper {


    public List<UserBean> findAll();

    public UserBean findById(int id);
}
