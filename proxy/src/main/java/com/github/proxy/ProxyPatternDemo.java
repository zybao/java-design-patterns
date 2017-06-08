package com.github.proxy;

/**
 * Created by zhiyong.bao on 2017/6/8.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("run.jpg");
        image.display();
    }
}
