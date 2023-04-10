package com.ua.robot.lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Bivanov", 98));
        list.add(new Student("Petrovansky", 75));
        list.add(new Student("Agolec", 93));
        list.add(new Student("Ztucko", 62));

        System.out.println("Unsorted list of students: ");
        list.forEach(System.out::println);
        System.out.println();


        System.out.println("List of students sorted by last name: ");
        list.stream()
                .sorted(new StudentSecondNameComparator())
                .forEach(System.out::println);
        System.out.println();


        System.out.println("List of students sorted by average student score: ");
        list.stream()
                .sorted(new StudentAverageScoreComparator())
                .forEach(System.out::println);


    }
}
