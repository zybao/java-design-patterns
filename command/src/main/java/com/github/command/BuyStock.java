package com.github.command;

/**
 * Created by zhiyong.bao on 2017/6/23.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock stock) {
        abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
