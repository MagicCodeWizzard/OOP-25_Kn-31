package com.college.oop.kn31.encapsulation.model;

public class Teacher {
    private String firstName;
    private String lastName;
    private int age;
    private String speciality;


    public Teacher() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 18;
        this.speciality = "College";
    }

    public Teacher(String firstName, String lastName, int age, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.speciality = speciality;
    }

    public String getFirstName() {
        return "Name is: " + firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("firstName cannot be empty");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
