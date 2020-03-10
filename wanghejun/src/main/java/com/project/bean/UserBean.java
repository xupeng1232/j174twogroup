package com.project.bean;

public class UserBean {

    private int id;

    private String name;

    private String psd;

    private int age;

    public UserBean() {
    }

    public UserBean(String name, String psd, int age) {
        this.name = name;
        this.psd = psd;
        this.age = age;
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

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
