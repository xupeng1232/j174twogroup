package com.project.mapper;

import com.project.entity.InfoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IInfoMapper {
    @Insert("insert into t_user_info(f_job,f_money,f_date,fk_userId)values(#{job},#{money},#{date},#{userEntity.id})")
    void addInfo(InfoEntity infoEntity);
    @Select("select pk_id id,f_job job,f_money money,f_date date from t_user_info where fk_userId=#{id}")
    List<InfoEntity> findInfoByUserId(int userId);
}
