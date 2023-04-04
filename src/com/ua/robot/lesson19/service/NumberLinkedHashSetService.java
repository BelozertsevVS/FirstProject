package com.ua.robot.lesson19.service;

import com.ua.robot.lesson19.repository.NumberMemoryRepositoryWithLinkedHashSet;

public class NumberLinkedHashSetService {
    private final NumberMemoryRepositoryWithLinkedHashSet numberMemoryRepositoryWithLinkedHashSet;

    public NumberLinkedHashSetService() {
        this.numberMemoryRepositoryWithLinkedHashSet = new NumberMemoryRepositoryWithLinkedHashSet();
    }

    public void printNumbers() {
        System.out.println("Storing a list of numbers using LinkedHashSet: ");
        for (Integer i : numberMemoryRepositoryWithLinkedHashSet.findAll()) {
            System.out.print(i + " ");
        }
    }
}
