package com.college.oop.kn31.patterns.factory_method;

import com.college.oop.kn31.patterns.model.User;
import com.college.oop.kn31.patterns.model.UserRegistry;

public class ObjectFactory {
    public static User createDefaultUser(String name)
    {
        User user = new User(name);
        UserRegistry.getInstance().addUser(user);

        return user;
    }

    public static User createAdvancedUser(String name, String address)
    {
        User user = new User(name, (short)1, address, true);
        UserRegistry.getInstance().addUser(user);

        return user;
    }

    public static User createAgedUser(String name, short age)
    {
        User user = new User(name, age, null, true);
        UserRegistry.getInstance().addUser(user);

        return user;
    }
}
