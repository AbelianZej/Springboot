package com.example.springbootfirst.dao;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private  String pwd;

//    public User(String name, int id, String pwd) {
//        this.name = name;
//        this.id = id;
//        this.pwd = pwd;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }
}
