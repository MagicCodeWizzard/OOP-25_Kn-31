package com.college.oop.kn31.functional_interface.model;

public interface Operation<T> {
    T execute(T a, T b);
}
