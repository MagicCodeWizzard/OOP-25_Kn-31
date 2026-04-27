package com.college.oop.kn31.comparable;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Hello");
        list.add("ABC");
        list.add("abc");
        list.add("Bye!");
        list.add("Pizza");
        list.add("Donat");

        System.out.println("Before sorting:");
        for(var value : list){
            System.out.println("Value -> " + value);
        }

        list.sort(new StringDescComparable(null));

        System.out.println("\nAfter inverse sorting:");
        for(var value : list){
            System.out.println("Value -> " + value);
        }

        list.sort(null);

        System.out.println("\nAfter sorting:");
        for(var value : list){
            System.out.println("Value -> " + value);
        }

    }
}
