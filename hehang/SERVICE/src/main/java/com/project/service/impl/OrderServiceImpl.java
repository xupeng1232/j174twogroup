package com.project.service.impl;
import com.project.bean.OrderBean;
import com.project.mapper.IOrderMapper;
import com.project.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderMapper mapper;

    @Override
    public void add(OrderBean orde) {
        mapper.add(orde);
    }

    @Override
    public void update() {
        mapper.update();
    }
}
