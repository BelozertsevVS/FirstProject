package com.ua.robot.lesson34.service;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        var result = random.nextInt(1,51);
        System.out.println(result);
        return result;
    }
}
