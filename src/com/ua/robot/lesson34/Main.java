package com.ua.robot.lesson34;

import com.ua.robot.lesson34.service.NumberCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> callables = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            callables.add(new NumberCallable());
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Integer>> futures = executorService.invokeAll(callables);

        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }

    }
}
