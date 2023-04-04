package com.ua.robot.lesson19.service;

import com.ua.robot.lesson19.repository.NumberMemoryRepositoryWithTreeSet;

public class NumberTreeSetService {
    private final NumberMemoryRepositoryWithTreeSet numberMemoryRepositoryWithTreeSet;

    public NumberTreeSetService() {
        this.numberMemoryRepositoryWithTreeSet = new NumberMemoryRepositoryWithTreeSet();
    }


    public void printNumbers() {
        System.out.println();
        System.out.println("Storing a list of numbers using TreeSet: ");
        for (Integer i : numberMemoryRepositoryWithTreeSet.findAll()) {
            System.out.print(i + " ");
        }
    }
}
