package com.project.entity;

import java.io.Serializable;
import java.util.List;

public class UserEntity implements Serializable {
    private int id;
    private String name;
    private String pwd;
    private int age;
    private List<InfoEntity>infoList;

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", infoList=" + infoList +
                '}';
    }

    public UserEntity(String name, String pwd, int age) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public UserEntity() {
    }

    public List<InfoEntity> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<InfoEntity> infoList) {
        this.infoList = infoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
