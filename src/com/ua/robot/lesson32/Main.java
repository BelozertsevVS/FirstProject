package com.ua.robot.lesson32;

import com.ua.robot.lesson32.service.PrintNumber;

public class Main {
    public static void main(String[] args) {

        PrintNumber pn = new PrintNumber();

        Thread thread0 = new Thread(pn);
        Thread thread1 = new Thread(pn);

        thread0.start();
        thread1.start();

    }
}
