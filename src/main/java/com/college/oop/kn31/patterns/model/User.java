package com.college.oop.kn31.patterns.model;

public class User {
    private String name;
    private short age;
    private String address;
    private boolean sex;

    public User(String name) {
        this.name = name;
    }

    public User(String name, short age, String address, boolean sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
