package com.college.oop.kn31.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> my_read_map = Map.of(
                1, "hello",
                2, "world"
        );

        Map<Integer, String> my_read_map_2 = Map.ofEntries(
                Map.entry(1, "hello"),
                Map.entry(2, "world")
        );

        Map.Entry<Integer, String> kvPair = Map.entry(2, "world");

        System.out.println(kvPair.getValue());
        System.out.println(kvPair.getKey());

        // Ітерація по парах
        for (var pair : my_read_map.entrySet()) {
            System.out.printf("Key -> %d| Value -> %s%n", pair.getKey(), pair.getValue());
        }

        // Ітерація по ключах
        for (var key : my_read_map.keySet()) {
            System.out.printf("Key -> %d| Value -> %s%n", key, my_read_map.get(key));
        }

        // Не можна змінювати словник тільки для читання!
        // my_read_map.put(4, "Hello");

        HashMap<Integer, String> my_map = new HashMap<>();
        HashMap<Integer, String> my_map1 = new HashMap<>(
                Map.of(1, "Hello")
        );

        my_map.put(1, "Ukraine!");
        my_map.put(2, null);
        my_map.put(3, "USA");
        my_map.put(4, "Australia");

        for (var pair : my_map.entrySet()) {
            System.out.printf("My Key -> %d| Value -> %s%n", pair.getKey(), pair.getValue());
        }

        System.out.println("Does key 1 exist? -> " + my_map.containsKey(1));
        System.out.println("Value for key 1 -> " + my_map.get(1).toUpperCase());

        System.out.println("Does key 10 exist? -> " + my_map.containsKey(3));
        System.out.println("Value for key 10 -> " + my_map.get(3).toUpperCase());

        System.out.println(my_map.getOrDefault(10, "No such entry!").toUpperCase());
    }
}
