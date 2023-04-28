package com.ua.robot.lesson32.service;

public class PrintNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Current Thread: " + Thread.currentThread().getName() + " number " + i);
        }
    }
}
