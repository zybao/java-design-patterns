package com.github.decorator;

/**
 * Created by zhiyong.bao on 2017/6/8.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }
}
