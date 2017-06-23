package com.github.command;

/**
 * Created by zhiyong.bao on 2017/6/23.
 */
public class SellStock implements Order {
    private Stock sellStock;

    public SellStock(Stock stock) {
        sellStock = stock;
    }

    @Override
    public void execute() {
        sellStock.sell();
    }
}
