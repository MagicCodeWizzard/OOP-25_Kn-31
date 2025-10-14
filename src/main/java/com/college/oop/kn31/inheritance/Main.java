package com.college.oop.kn31.inheritance;

import com.college.oop.kn31.inheritance.model.AutomotivePart;
import com.college.oop.kn31.inheritance.model.LightningSystem;

public class Main {
    public static void main(String[] args) {
        AutomotivePart part = new AutomotivePart();
        LightningSystem lightningSystem = new LightningSystem();

        System.out.println(lightningSystem.getMaterial());
        System.out.println(lightningSystem.getName());

        System.out.println(lightningSystem);

        part.turnOn();
        part.turnOn();

        System.out.println(part);

        part.turnOff();

        System.out.println(part);

        lightningSystem.turnOn();
        lightningSystem.turnOn();

        System.out.println(lightningSystem);

        lightningSystem.turnOff();

        System.out.println(lightningSystem);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
