package com.project.controller;

import com.project.entity.InfoEntity;
import com.project.entity.UserEntity;
import com.project.service.IInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InfoController {
    @Autowired
    private IInfoService service;
    @RequestMapping("addInfo.lovo")
    public void addInfo(int userId,InfoEntity infoEntity){
        UserEntity userEntity=new UserEntity();
        userEntity.setId(userId);
        infoEntity.setUserEntity(userEntity);
        service.addInfo(infoEntity);
    }
    @RequestMapping("findInfoByUserId.lovo")
    public List<InfoEntity> findInfoByUserId(int userId){
        return service.findInfoByUserId(userId);
    }
}
