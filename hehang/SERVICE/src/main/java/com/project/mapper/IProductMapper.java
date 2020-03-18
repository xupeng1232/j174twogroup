package com.project.mapper;

import org.apache.ibatis.annotations.Update;

public interface IProductMapper {

    /**修改商品库存*/
    @Update("update t_product set p_num = p_num-#{param2}  where p_id = #{param1}")
    public void update(int id,int num);
}
