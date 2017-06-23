package com.github.interpreter;

/**
 * Created by zhiyong.bao on 2017/6/8.
 */
public interface Expression {
    boolean interpret(String context);
}
