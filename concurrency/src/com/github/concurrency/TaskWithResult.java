package com.github.concurrency;

import java.util.concurrent.Callable;

/**
 * Created by zhiyong.bao on 2017/6/14.
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }


    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}
