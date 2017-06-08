package com.github.bridge;

/**
 * Created by zhiyong.bao on 2017/6/1.
 */
public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
