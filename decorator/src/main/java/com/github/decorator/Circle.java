package com.github.decorator;

/**
 * Created by zhiyong.bao on 2017/6/8.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
