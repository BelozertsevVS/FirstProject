package com.ua.robot.lesson18.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumbersMemoryRepositoryFor10elements {
    public static final int SIZE = 10;

    private List<Integer> numbersWithTenElements = new ArrayList<>(SIZE);

    public NumbersMemoryRepositoryFor10elements() {
        fillNumbersMemoryRepositoryFor10elements();
    }


    private void fillNumbersMemoryRepositoryFor10elements() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            numbersWithTenElements.add(i, random.nextInt(1, 1000));
        }
    }

    public List<Integer> findAll() {
        return numbersWithTenElements;
    }


    @Override
    public String toString() {
        return "NumbersMemoryRepositoryFor10elements{" +
                "numbersWithTenElements=" + numbersWithTenElements +
                '}';
    }

    public Integer get(int i) {
        return numbersWithTenElements.get(i);
    }


}
