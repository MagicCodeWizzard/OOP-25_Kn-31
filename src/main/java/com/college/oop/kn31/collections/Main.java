package com.college.oop.kn31.collections;

import com.college.oop.kn31.collections.model.ContainerType;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ContainerType element1 = new ContainerType(10);
        ContainerType element2 = new ContainerType(20);
        ContainerType element3 = new ContainerType(30);
        ContainerType element4 = new ContainerType(40);
        ContainerType element5 = new ContainerType(50);

        element1.setNext(element2);
        element2.setNext(element3);
        element3.setNext(element5);
        element5.setNext(element4);

//        System.out.println("=== From first ===");
//        printElements(element1);
//
//
//        System.out.println("=== From third ===");
//        printElements(element3);
//
//
//        System.out.println("=== From last ===");
//        printElements(element5);

        vectorDemo(new Scanner(System.in));
    }

    public static void printElements(ContainerType element) {
        if (element == null) {
            System.out.println("No element provided in function!");
        }

        ContainerType currElement = element;

        do {
            System.out.println("Current element -> " + currElement.toString());
        } while((currElement = currElement.getNext()) != null);

        System.out.println(currElement.getNext());
    }

    public static void linkedListDemo(Scanner scanner)
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(45);
        ll.add(66, 1);

        ll.remove(1);
        ll.remove(Integer.valueOf(45));

        ll.clear();
    }

    public static void arrayListDemo(Scanner scanner)
    {
        ArrayList<String> al = new ArrayList<>();

        al.add("String");
        al.add(5, "String");

        ArrayList<String> al1 = new ArrayList<>(20);
        ArrayList<String> al2 = new ArrayList<>(20);

        al.ensureCapacity(50);
    }

    public static void vectorDemo(Scanner scanner)
    {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> v1 = new Vector<>(30);
        Vector<Integer> v2 = new Vector<>(30, 5);

        System.out.printf("Vector v capacity: %d, size: %d%n", v.capacity(), v.size());
        System.out.printf("Vector v1 capacity: %d, size: %d%n", v1.capacity(), v1.size());
        System.out.printf("Vector v2 capacity: %d, size: %d%n", v2.capacity(), v2.size());

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                v.add((j + 1) * (i + 1));
                v1.add((j + 1) * (i + 1));
                v2.add((j + 1) * (i + 1));
            }

            System.out.println("+++++++++++++++++++");
            System.out.printf("Vector v capacity: %d, size: %d%n", v.capacity(), v.size());
            System.out.printf("Vector v1 capacity: %d, size: %d%n", v1.capacity(), v1.size());
            System.out.printf("Vector v2 capacity: %d, size: %d%n", v2.capacity(), v2.size());
        }
    }
}
