package com.project.mapper;

import com.project.bean.OrderBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Update;

public interface IOrderMapper {

    /**添加订单*/
    /*@Insert("insert into t_order values (null,#{fk_product},#{price})")
    @Options(useGeneratedKeys = true,keyProperty = "id")*/
    public void add(OrderBean orde);

    /**用于测试事务回滚的方法*/
    /*@Update("update t_order1 set o_price=20 where o_id = 12")*/
    public void update();
}
