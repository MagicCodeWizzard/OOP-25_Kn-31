package com.college.oop.kn31.inheritance.model;

import java.util.Arrays;

public class AutomotivePart {
    protected int[] size;
    protected String name;
    protected String material;
    protected boolean isTurnedOn;

    public AutomotivePart() {
        size = new int[3];
        name = "";
        material = "";
        isTurnedOn = false;
    }

    public AutomotivePart(int[] size, String name, String material) {
        this.size = size;
        this.name = name;
        this.material = material;
        isTurnedOn = false;
    }

    public String toString() {
        return "Size: " + Arrays.toString(size) + ", Name: " + name + ", Material: " + material + ", IsTurnedOn: " + isTurnedOn;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void turnOn()
    {
        if (isTurnedOn) {
            System.out.println("AutomotivePart is already turned on!");
            return;
        }

        System.out.println("---------------------------------");
        System.out.println("Turning on the automotive part!!!");
        System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");

        isTurnedOn = true;
    }

    public void turnOff()
    {
        if (!isTurnedOn) {
            System.out.println("AutomotivePart is already turned off!");
            return;
        }

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Turning off the automotive part!!!");
        System.out.println("__________________________________");

        isTurnedOn = false;
    }
}
