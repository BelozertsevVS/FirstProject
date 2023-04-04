package com.ua.robot.lesson19.service;

import com.ua.robot.lesson19.repository.NumberMemoryRepositoryWithHashSet;

public class NumberHashSetService {
    private final NumberMemoryRepositoryWithHashSet numberMemoryRepositoryWithHashSet;

    public NumberHashSetService() {
        this.numberMemoryRepositoryWithHashSet = new NumberMemoryRepositoryWithHashSet();
    }

    public void printNumbers() {
        System.out.println("Storing a list of numbers using HashSet: ");
        for (Integer i : numberMemoryRepositoryWithHashSet.findAll()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
