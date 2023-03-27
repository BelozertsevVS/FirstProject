package com.ua.robot.lesson18.service;

import com.ua.robot.lesson18.repository.NumbersMemoryRepositoryFor10elements;

public class Numbers10Service {
    private final NumbersMemoryRepositoryFor10elements numbersMemoryRepositoryFor10elements;

    public Numbers10Service() {
        numbersMemoryRepositoryFor10elements = new NumbersMemoryRepositoryFor10elements();
    }

    public void printNumbers10() {
        System.out.println("Storing a list of numbers with 10 elements using ArrayList: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbersMemoryRepositoryFor10elements.get(i) + " ");
        }
        System.out.println();
    }
}


