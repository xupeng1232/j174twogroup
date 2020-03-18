package com.project.service.impl;

import com.project.entity.OrderEntity;
import com.project.mapper.IGoodsMapper;
import com.project.mapper.IOrderMapper;
import com.project.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private IGoodsMapper goodsMapper;
    @Autowired
    private IOrderMapper orderMapper;
    @Override
    public void buy(int goodsId, int buyNumber) {
        goodsMapper.update(goodsId,buyNumber);
        orderMapper.addOrder(new OrderEntity(buyNumber,goodsId));
    }
}
