package com.project.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class InfoEntity {
    private int id;
    private String job;
    private int money;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date=new Date(System.currentTimeMillis());
    private UserEntity userEntity;

    @Override
    public String toString() {
        return "InfoEntity{" +
                "id=" + id +
                ", job='" + job + '\'' +
                ", money=" + money +
                ", date=" + date +
                ", userEntity=" + userEntity +
                '}';
    }

    public InfoEntity(String job, int money, int userId) {
        this.job = job;
        this.money = money;
        UserEntity userEntity=new UserEntity();
        userEntity.setId(userId);
        this.userEntity=userEntity;
    }

    public InfoEntity() {
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
