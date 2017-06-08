package com.github.bridge;

/**
 * Created by zhiyong.bao on 2017/6/1.
 */
public class BridgeApp {
    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(50, 50, 5, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
