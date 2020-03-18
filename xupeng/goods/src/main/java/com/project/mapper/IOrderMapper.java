package com.project.mapper;

import com.project.entity.OrderEntity;
import org.apache.ibatis.annotations.Insert;

public interface IOrderMapper {
    @Insert("insert into t_goods_info(fk_goodsId,f_number)values(#{goodsEntity.id},#{number})")
    void addOrder(OrderEntity orderEntity);
}
