package com.college.oop.kn31.patterns.singleton;

import com.college.oop.kn31.patterns.model.User;
import com.college.oop.kn31.patterns.model.UserRegistry;

public class Main {
    public static void main(String[] args) {
        UserRegistry reg1 = UserRegistry.getInstance();
        UserRegistry reg2 = UserRegistry.getInstance();

        System.out.println((reg1 == reg2));

        reg1.addUser(new User("Andrii"));
        UserRegistry.getInstance().addUser(new User("Vitalii"));
    }
}
