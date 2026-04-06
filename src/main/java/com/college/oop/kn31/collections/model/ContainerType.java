package com.college.oop.kn31.collections.model;

public class ContainerType {
    private Object value;
    private ContainerType next = null;

    public ContainerType(Object value)
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

    public Object getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        return "ContainerType{" +
                "value=" + value +
                '}';
    }
}
