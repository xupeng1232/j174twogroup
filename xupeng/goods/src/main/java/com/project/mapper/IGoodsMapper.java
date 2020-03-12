package com.project.mapper;

import org.apache.ibatis.annotations.Update;

public interface IGoodsMapper {
    @Update("update t_goods set f_number=f_number-#{arg1} where pk_id=#{arg0}")
    void update(int goodsId, int buyNumber);
}
