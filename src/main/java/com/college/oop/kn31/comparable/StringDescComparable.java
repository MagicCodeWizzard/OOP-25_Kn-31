package com.college.oop.kn31.comparable;

import java.util.Comparator;

public class StringDescComparable
        implements Comparable<String>, Comparator<String> {

    private final String object;

    public StringDescComparable(String object) {
        this.object = object;
    }

    @Override
    public int compareTo(String o) {
        return -1 * object.compareTo(o);
    }

    @Override
    public int compare(String o1, String o2) {
        return -1 * o1.compareTo(o2);
    }
}
