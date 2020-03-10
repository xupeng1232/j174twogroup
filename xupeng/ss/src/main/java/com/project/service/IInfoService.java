package com.project.service;

import com.project.entity.InfoEntity;

import java.util.List;

public interface IInfoService {
    void addInfo(InfoEntity infoEntity);
    List<InfoEntity> findInfoByUserId(int userId);
}
