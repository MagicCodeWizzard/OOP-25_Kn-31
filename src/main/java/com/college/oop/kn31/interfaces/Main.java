package com.college.oop.kn31.interfaces;

import com.college.oop.kn31.interfaces.model.*;

public class Main {
    public static void main(String[] args) {
        Drawable drawable = new Triangle();

        Hexagon hex = new Hexagon();
        render(hex);
        check_memory(hex);
        check_memory(drawable);
    }

    public static void render(Drawable obj)
    {
        obj.clear();
        obj.draw();
        obj.delete();
    }

    public static void check_memory(Managable man)
    {
        man.create();
        man.delete();
    }

}
