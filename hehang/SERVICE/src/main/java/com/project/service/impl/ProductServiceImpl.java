package com.project.service.impl;
import com.project.mapper.IProductMapper;
import com.project.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductMapper mapper;

    @Override
    public void update(int id, int num) {

        mapper.update(id, num);
    }
}
