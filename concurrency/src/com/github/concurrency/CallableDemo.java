package com.github.concurrency;

import java.util.concurrent.*;

/**
 * Created by zhiyong.bao on 2017/6/14.
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Result";
            }
        };

        Future<String> future = executorService.submit(callable);
        String result = future.get();
        executorService.shutdown();

    }
}
