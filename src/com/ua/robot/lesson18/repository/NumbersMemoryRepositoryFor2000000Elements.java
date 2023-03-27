package com.ua.robot.lesson18.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NumbersMemoryRepositoryFor2000000Elements {
    public static final int SIZE = 2000000;

    private List<Integer> numbersWith2000000Elements = new LinkedList<>();

    public NumbersMemoryRepositoryFor2000000Elements() {
        fillNumbersMemoryRepositoryFor2000000Elements();
    }


    private void fillNumbersMemoryRepositoryFor2000000Elements() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            numbersWith2000000Elements.add(i, random.nextInt(1,10));
        }
    }

    public List<Integer> findAll() {
        return numbersWith2000000Elements;
    }




    public Integer get(int i) {
        return numbersWith2000000Elements.get(i);
    }

}
