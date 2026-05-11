package com.college.oop.kn31.functional_interface;

import com.college.oop.kn31.functional_interface.model.priv.Mathematics;
import com.college.oop.kn31.functional_interface.model.priv.Minus;
import com.college.oop.kn31.functional_interface.model.priv.Multiply;
import com.college.oop.kn31.functional_interface.model.Operation;
import com.college.oop.kn31.functional_interface.model.priv.Plus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.*;
import java.util.function.Predicate;

public class Main {
    static boolean shouldContinue = true;

    public static void executeOperation(Scanner s, Operation<Integer> op)
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

        Operation<Integer> exitOp = (Integer a, Integer b) -> {
            shouldContinue = false; return 0;
        };

        Predicate<Boolean> boolean_predicate = (Boolean b) -> { return false; };
        Predicate<Integer> integer_predicate = (Integer arg) -> {
            return (arg > 10);
        };

        Consumer<LocalDateTime> dateConsumer = (time) -> {
            System.out.println(time.format(DateTimeFormatter.ISO_DATE));
        };

        Supplier<LocalDateTime> dateTimeProducer = () -> {
            return LocalDateTime.now();
        };

        Function<String, Integer> myFunction = (String argument) -> {
            return argument.length();
        };

        BiFunction<String, Integer, Boolean> myBiFunction =
                (String arg, Integer len) -> {
            return arg.length() == len;
        };

        UnaryOperator<Double> mySquare = (Double d) -> {
            return d * d;
        };
        mySquare.apply(334.6);

        BinaryOperator<Double> myPlus = (Double d1, Double d2) -> {
            return d1 + d2;
        };
        myPlus.apply(23.7, 67.9);

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
                    executeOperation(s, (Integer a, Integer b) -> {
                        shouldContinue = false; return 0;
                    });
                    break;
            }
        }
    }
}
