package com.project.bean;

import java.sql.Date;

public class UserInfoBean {

    private int id;

    private String post;

    private String wage;

    private Date cgTime;

    public UserInfoBean() {
    }

    public UserInfoBean(String post, String wage, Date cgTime) {
        this.post = post;
        this.wage = wage;
        this.cgTime = cgTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public Date getCgTime() {
        return cgTime;
    }

    public void setCgTime(Date cgTime) {
        this.cgTime = cgTime;
    }
}
