package com.project.service.impl;

import com.project.entity.InfoEntity;
import com.project.mapper.IInfoMapper;
import com.project.service.IInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements IInfoService {
    @Autowired
    private IInfoMapper mapper;
    @Override
    public void addInfo(InfoEntity infoEntity) {
        mapper.addInfo(infoEntity);
    }

    @Override
    public List<InfoEntity> findInfoByUserId(int userId) {
        return mapper.findInfoByUserId(userId);
    }
}
