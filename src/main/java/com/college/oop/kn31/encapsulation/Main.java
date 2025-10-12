package com.college.oop.kn31.encapsulation;

import com.college.oop.kn31.encapsulation.model.Teacher;
import com.college.oop.kn31.encapsulation.model.User;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void overloadingExamples()
    {
        printInfo();
        //printInfo(true);
        printInfo((short)34);
        printInfo(Integer.valueOf(34));
        printInfo(58);
    }

    public static void encapsulationExamples()
    {
        User user = new User();
        user.lastName = "Smith";

        Random data_rand = new Random();

        int age_temp = data_rand.nextInt();
        if (age_temp >= 10 && age_temp < 150) {
            user.age = age_temp;
        }

        age_temp = data_rand.nextInt();
        if (age_temp >= 10 && age_temp < 150) {
            user.age = age_temp;
        }

        age_temp = data_rand.nextInt();
        if (age_temp >= 10 && age_temp < 150) {
            user.age = age_temp;
        }
    }

    public static void main(String[] args) {
        overloadingExamples();
        encapsulationExamples();

        Teacher teacher = new Teacher();
        teacher.setFirstName("Andrii");
        teacher.setFirstName("Oleh");

        try {
            Scanner sc = new Scanner(System.in);

            String name = sc.nextLine();
            teacher.setFirstName(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("First name of teacher is: " + teacher.getFirstName());
    }

    public static void printInfo()
    {

    }

//    public static void printInfo(boolean b)
//    {
//
//    }

    public static void printInfo(int rows)
    {

    }

//    public static void printInfo(Integer rows)
//    {
//
//    }

    public static void printInfo(int rows, LocalDateTime date)
    {

    }

}
