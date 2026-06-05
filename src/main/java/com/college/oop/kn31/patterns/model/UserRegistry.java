package com.college.oop.kn31.patterns.model;

import java.util.LinkedList;

public class UserRegistry {
    private static UserRegistry instance;

    private LinkedList<User> userList;

    private UserRegistry() {
        userList = new LinkedList<>();
    }

    public static UserRegistry getInstance()
    {
        if (instance == null) {
            instance = new UserRegistry();
        }
        return instance;
    }

    public void addUser(User user) {
        userList.add(user);
    }
}
