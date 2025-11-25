package com.college.oop.kn31.enumerations.model;

public class TrafficLight {
    private int state;
    private String address;
    private boolean isAutonomous;

    public TrafficLight() {
    }

    public TrafficLight(int state, String address, boolean isAutonomous) {
        this.state = state;
        this.address = address;
        this.isAutonomous = isAutonomous;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAutonomous() {
        return isAutonomous;
    }

    public void setAutonomous(boolean autonomous) {
        isAutonomous = autonomous;
    }

    public void visualizeState() {
        System.out.println("++++++++++++++");
        System.out.printf("Current state of the traffic light: %d%n", this.state);
        System.out.println("++++++++++++++");
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "state=" + state +
                ", address='" + address + '\'' +
                ", isAutonomous=" + isAutonomous +
                '}';
    }
}
