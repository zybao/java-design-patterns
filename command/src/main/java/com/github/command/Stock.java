package com.github.command;

/**
 * Created by zhiyong.bao on 2017/6/23.
 */
public class Stock {
    private String name = "abc";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
