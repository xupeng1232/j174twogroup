package com.project.service;

import com.project.bean.OrderBean;

/**
 * 订单业务接口
 */
public interface IOrderService {

    /**添加订单*/
    public void add(OrderBean orde);

    /**用于测试事务回滚的方法*/
    public void update();
}
