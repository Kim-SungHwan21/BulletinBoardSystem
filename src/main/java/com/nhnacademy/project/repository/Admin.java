package com.nhnacademy.project.repository;

public class Admin {

    private String id;
    private String pwd;
    private String name;

    public Admin(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String getId() {
        return this.id = id;
    }

    public String getPwd() {
        return this.pwd = pwd;
    }

    public String getName() {
        return this.name = name;
    }
}
