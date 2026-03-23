package com.college.oop.kn31.collections.model;

public class ContainerType {
    private int value;
    private ContainerType next = null;

    public ContainerType(int value)
    {
        this.value = value;
    }

    public void setNext(ContainerType next)
    {
        this.next = next;
    }

    public ContainerType getNext()
    {
        return next;
    }

    @Override
    public String toString() {
        return "ContainerType{" +
                "value=" + value +
                '}';
    }
}
