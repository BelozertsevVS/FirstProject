package com.ua.robot.lesson18.service;

import com.ua.robot.lesson18.repository.NumbersMemoryRepositoryFor2000000Elements;

public class Numbers2000000Service {
    private final NumbersMemoryRepositoryFor2000000Elements numbersMemoryRepositoryFor2000000Elements;

    public Numbers2000000Service() {
        numbersMemoryRepositoryFor2000000Elements = new NumbersMemoryRepositoryFor2000000Elements();
    }

    public void printNumbers2000000() {
        System.out.println("Storing a list of numbers with 2000000 elements using LinkedList: ");
        for (int i = 0; i < 2000000; i++) {
            System.out.print(numbersMemoryRepositoryFor2000000Elements.get(i) + " ");
        }
        System.out.println();
    }
}



