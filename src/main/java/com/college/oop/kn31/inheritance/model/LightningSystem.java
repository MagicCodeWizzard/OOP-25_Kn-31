package com.college.oop.kn31.inheritance.model;

import java.util.Objects;

public class LightningSystem extends AutomotivePart {
//    private int[] size;
//    private String name;
//    private String material;

    private String color;
    private long range;
    private int lenses_count;
    private int brightness;

    public LightningSystem()
    {
        super();

        super.name = "Lightning System";
        color = "black";
    }

    public LightningSystem(int[] size, String name, String material) {
        super(size, name, material);

        color = "black";
    }

    @Override
    public void turnOn()
    {
        super.turnOn();

        System.out.println("Switch on the light");
        System.out.println("Color: " + color + ", with brightness: " + brightness);
    }

    @Override
    public void turnOff()
    {
        super.turnOff();

        System.out.println("Switching off the light");
    }

    @Override
    public String toString() {
        return "LightningSystem{" +
                "color='" + color + '\'' +
                ", range=" + range +
                ", lenses_count=" + lenses_count +
                ", brightness=" + brightness +
                super.toString()
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightningSystem that = (LightningSystem) o;
        return range == that.range && lenses_count == that.lenses_count && brightness == that.brightness && Objects.equals(color, that.color);
    }

}
