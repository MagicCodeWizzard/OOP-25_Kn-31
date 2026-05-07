package com.college.oop.kn31.functional_interface;

import com.college.oop.kn31.functional_interface.model.priv.Mathematics;
import com.college.oop.kn31.functional_interface.model.priv.Minus;
import com.college.oop.kn31.functional_interface.model.priv.Multiply;
import com.college.oop.kn31.functional_interface.model.Operation;
import com.college.oop.kn31.functional_interface.model.priv.Plus;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static boolean shouldContinue = true;

    public static void executeOperation(Scanner s, Operation op)
    {
        int a, b;

        System.out.print("Enter first arg -> ");
        a = s.nextInt();
        s.nextLine();

        System.out.print("Enter second arg -> ");
        b = s.nextInt();
        s.nextLine();

        int result = op.execute(a, b);

        System.out.println("Result -> " + result);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Operation operation;

        Plus p = new Plus();
        Minus m = new Minus();
        Multiply mul = new Multiply();

        Operation exitOp = (int a, int b) -> {
            shouldContinue = false; return 0;
        };

        while (shouldContinue) {
            System.out.print("Enter operation to be executed -> ");
            switch (s.nextLine()) {
                case "+":
                    executeOperation(s, p::doPlus);
                    break;
                case "-":
                    executeOperation(s, Mathematics::minus);
                    break;
                case "*":
                    executeOperation(s, mul::doMultiply);
                    break;
                case "/":
                    executeOperation(s, Mathematics::divide);
                    break;
                case "~":
                    executeOperation(s, (int a, int b) -> {
                        shouldContinue = false; return 0;
                    });
                    break;
            }
        }
    }
}
