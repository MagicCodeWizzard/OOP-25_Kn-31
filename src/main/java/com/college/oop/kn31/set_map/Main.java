package com.college.oop.kn31.set_map;

import com.college.oop.kn31.interfaces.model.Point;
import com.college.oop.kn31.interfaces.model.Rectangle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var set = Set.of("String", "Hello", "No!");

        for (var value : set) {
            System.out.println("Value -> " + value);
        }

        HashSet<String> hs = new HashSet<>();
        hs.add("Hello!");
        hs.add("yes!");
        hs.add("YES!");
        hs.add("Bye!");
        hs.add("Hello!");

        for (var value : hs) {
            System.out.println("HasSet Value -> " + value);
        }

        HashSet<Date> date_set = new HashSet<>();
        date_set.add(new Date(99, Calendar.JANUARY, 10));
        date_set.add(new Date(99, Calendar.JANUARY, 10));

        date_set.add(new Date(99, Calendar.FEBRUARY, 10));
        date_set.add(new Date(99, Calendar.MARCH, 10));

        date_set.add(new Date(100, Calendar.MARCH, 10));

        for (var value : date_set) {
            System.out.println("Date HasSet Value -> " + value);
        }

        boolean cont =  date_set.contains(new Date(100, Calendar.MARCH, 10));
        System.out.println("Date HasSet contains -> " + cont);

        HashSet<Rectangle> rect = new HashSet<>();
        rect.add(new Rectangle());
        rect.add(new Rectangle(10, 10, new Point[]{
                new Point(11,1), new Point(1,2),
                new Point(12,1), new Point(21,1)
        }));
        rect.add(new Rectangle(11, 10, new Point[]{
                new Point(1,1), new Point(1,21),
                new Point(12,1), new Point(21,1)
        }));
        rect.add(new Rectangle(11, 10, new Point[]{
                new Point(1,1), new Point(1,21),
                new Point(12,1), new Point(21,1)
        }));

        for (var value : rect) {
            System.out.println("Rectangle HasSet -> " + value);
        }
    }
}
