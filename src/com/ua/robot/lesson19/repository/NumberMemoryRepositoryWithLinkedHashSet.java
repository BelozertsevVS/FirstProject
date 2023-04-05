package com.ua.robot.lesson19.repository;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class NumberMemoryRepositoryWithLinkedHashSet {
    public static final int SIZE = 1000;

    private Set<Integer> numbers = new LinkedHashSet<>();

    public NumberMemoryRepositoryWithLinkedHashSet() {
        enterNumberIntoLinkedHashSet();
    }

    private void enterNumberIntoLinkedHashSet(){
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            numbers.add(random.nextInt(1,50));
        }
    }

    public Set<Integer> findAll(){
        return numbers;
    }

    @Override
    public String toString() {
        return "NumberMemoryRepositoryWithLinkedHashSet{" +
                "numbers=" + numbers +
                '}';
    }

}
