package com.ua.robot.lesson33.service;

import java.util.Random;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            Random random = new Random();
            int result = random.nextInt(1, 11);
            System.out.println(result);
            if (result == 5) {
                Thread.currentThread().interrupt();
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
            }
        }
    }
}
