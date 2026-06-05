package com.college.oop.kn31.patterns.factory_method;

import com.college.oop.kn31.patterns.model.User;

public class Main {
    public static void main(String[] args) {
        User user1 = ObjectFactory.createDefaultUser("Vasilii");
        User user2 = ObjectFactory.createAgedUser("Alex", (short)23);
        User user3 = ObjectFactory.createAdvancedUser("Lion", "bd. Ukrainian heroes, 6");
    }
}
