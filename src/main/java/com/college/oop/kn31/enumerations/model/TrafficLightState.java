package com.college.oop.kn31.enumerations.model;

public enum TrafficLightState {
    RED("This is a red color"), // 0
    YELLOW("This is a yellow color"), // 1
    GREEN, // 2
    RED_YELLOW; // 3

    TrafficLightState()
    {
        this.message = toString() + " color";
    }

    TrafficLightState(String message)
    {
        this.message = message;
    }

    private String message;

    public String getMessage()
    {
        return this.message;
    }
}
