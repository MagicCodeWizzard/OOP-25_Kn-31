package com.college.oop.kn31.collections.list.model;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GeneralizedContainerType<T> implements Iterable<T> {
    private T value;
    private GeneralizedContainerType<T> next;
    private GeneralizedContainerType<T> previous;


    public GeneralizedContainerType(T value) {
        this.value = value;
    }

    public GeneralizedContainerType(T value, GeneralizedContainerType<T> next, GeneralizedContainerType<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public GeneralizedContainerType<T> getNext() {
        return next;
    }

    public void setNext(GeneralizedContainerType<T> next) {
        this.next = next;
    }

    public GeneralizedContainerType<T> getPrevious() {
        return previous;
    }

    public void setPrevious(GeneralizedContainerType<T> previous) {
        this.previous = previous;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
