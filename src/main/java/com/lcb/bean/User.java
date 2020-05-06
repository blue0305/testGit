package com.lcb.bean;

public class User {
    private String name;
    private String password;
    private Integer age;
    private String tel;
    private String desc;

    public User(String name, String password, Integer age, String tel) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.tel = tel;
    }

    public User() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
