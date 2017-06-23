package com.github.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiyong.bao on 2017/6/23.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrder() {
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
