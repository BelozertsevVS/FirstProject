package com.ua.robot.lesson19.repository;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NumberMemoryRepositoryWithTreeSet {
    public static final int SIZE = 1000;
    private Set<Integer> numbers = new TreeSet<>();

    public NumberMemoryRepositoryWithTreeSet() {
        enterNumberIntoTreeSet();
    }

    private void enterNumberIntoTreeSet() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            numbers.add(random.nextInt(1, 50));
        }
    }

    public Set<Integer> findAll() {
        return numbers;
    }

    @Override
    public String toString() {
        return "NumberMemoryRepositoryWithTreeSet{" +
                "numbers=" + numbers +
                '}';
    }


}
