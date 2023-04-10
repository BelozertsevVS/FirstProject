package com.ua.robot.lesson23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // Task one:

        List<Surname> list1 = List.of(
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ivanko"),
                new Surname("Ovnyk"),
                new Surname("Ovnyk"),
                new Surname("Ovnyk"),
                new Surname("Ovnyk"),
                new Surname("Ovnyk"),
                new Surname("Ovnyk"),
                new Surname("Ovnyk"),
                new Surname("Stycyk"),
                new Surname("Stycyk"),
                new Surname("Stycyk")
        );

        Map<String, Long> map1 = list1.stream()
                .collect(Collectors.groupingBy(Surname::getSurname, Collectors.counting()));
        System.out.println(map1);


        // Task two:

        List<Integer> list2 = new ArrayList<>();
        Random random = new Random();
        int size = 10;
        var result = IntStream.range(0, size)
                .map(it -> random.nextInt(1, 25))
                .sum();

        System.out.println(result);


    }
}
