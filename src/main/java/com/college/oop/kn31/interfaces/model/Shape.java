package com.college.oop.kn31.interfaces.model;

public abstract class Shape implements Drawable {
    public static final int MIN_POINTS_NUMBER = 3;

    private double width;
    private double height;
    private Point[] points;

    public Shape() {
        this.width = 0;
        this.height = 0;

        this.points = new Point[] {
            new Point(0, 0), new Point(0, 0), new Point(0, 0)
        };
    }

    public Shape(double width, double height, Point[] points) {
        this.width = width;
        this.height = height;

        if (points.length < MIN_POINTS_NUMBER) {
            throw new IllegalArgumentException("Not enough points");
        }
        this.points = points;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void draw() {
        System.out.printf(
            "+++++%nThis is a shape %fx%f with number of vertices: %d%n+++++%n",
            this.height, this.width, this.points.length
        );
    }

    public void clear()
    {

    }

    @Override
    public void create() {

    }
}
