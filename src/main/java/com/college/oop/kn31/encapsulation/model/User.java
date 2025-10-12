package com.college.oop.kn31.encapsulation.model;

public class User {
    private String name;
    public String lastName;
    public int age;
    public String gender;

    public User() {
    }

    public User(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
}
