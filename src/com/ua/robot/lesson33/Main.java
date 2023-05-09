package com.ua.robot.lesson33;

import com.ua.robot.lesson33.service.NumberGenerator;

public class Main {
    public static void main(String[] args) {

        NumberGenerator ng = new NumberGenerator();

        Thread thread0 = new Thread(ng);
        thread0.start();

    }
}
