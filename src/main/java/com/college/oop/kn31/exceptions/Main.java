package com.college.oop.kn31.exceptions;

import com.college.oop.kn31.exceptions.exception.InvalidFunctionException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void myFunction(int argument)
    {
        if (argument < 100) {
            throw new InvalidFunctionException("Argument less then 100!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter number A: ");
                String s = scanner.nextLine();
                int a = Integer.parseInt(s);

                System.out.print("Enter number B: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                int c = a / b;

                System.out.println("\nc = " + c);

                myFunction(99);

                break;
            } catch (InputMismatchException ex) {
                System.out.println("Please enter only numbers!");
                scanner.nextLine();
            } catch(NumberFormatException ex) {
                System.out.println("Please enter only numbers!");
            } catch (ArithmeticException ex) {
                System.out.println("Second argument cannot be 0!");
            } catch (InvalidFunctionException ex) {
                System.out.println(ex.getMessage());
            }
        }

        scanner.close();
    }
}
