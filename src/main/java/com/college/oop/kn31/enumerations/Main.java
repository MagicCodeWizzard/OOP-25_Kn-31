package com.college.oop.kn31.enumerations;

import com.college.oop.kn31.enumerations.model.TrafficLight;
import com.college.oop.kn31.enumerations.model.TrafficLightState;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        light.setAddress("Ukrainian Heroes blvd, 6; Odesa");
        light.setAutonomous(true);
        light.setState(Integer.MAX_VALUE);

        light.visualizeState();

        String state1 = "RED";

        TrafficLightState state = TrafficLightState.RED;
        System.out.println("Current state: " + state);
        System.out.println("Int state: " + state.ordinal());
        System.out.println("Int state: " + TrafficLightState.RED_YELLOW.ordinal());

        TrafficLightState[] states = TrafficLightState.values();
        System.out.println("Possible states: " + Arrays.toString(states));

        System.out.println();
        for (var s : states) {
            System.out.printf("For state '%s' -> %s%n", s, s.getMessage());
        }
    }
}
