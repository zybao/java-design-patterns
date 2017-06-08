package com.github.flyweight;

import java.util.HashMap;

/**
 * Created by zhiyong.bao on 2017/6/8.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }

        return circle;
    }
}
