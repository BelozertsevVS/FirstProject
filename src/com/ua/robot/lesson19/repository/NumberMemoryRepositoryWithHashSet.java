package com.ua.robot.lesson19.repository;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class NumberMemoryRepositoryWithHashSet {
    public static final int SIZE = 1000;

    private Set<Integer> numbers = new HashSet<>();

    public NumberMemoryRepositoryWithHashSet() {
        enterNumbersIntoHashSet();
    }

    private void enterNumbersIntoHashSet() {
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
        return "NumberMemoryRepositoryWithHashSet{" +
                "numbers=" + numbers +
                '}';
    }



}
