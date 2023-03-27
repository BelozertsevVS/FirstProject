package com.ua.robot.lesson18.repository;

import com.ua.robot.lesson18.domain.Sex;
import com.ua.robot.lesson18.domain.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StudentMemoryRepositoryWithLinkedList {
    public static final int SIZE = 10;
    private final List<Student> students = new LinkedList<>();

    public StudentMemoryRepositoryWithLinkedList() {
        fillLinkedListWithStudents();
    }

    public Student get (int i) {
        return students.get(i);
    }
//
    public void fillLinkedListWithStudents() {
        for (int i = 0; i < SIZE; i++) {
            Student student = getRandomStudent();
            students.add(i, student);
        }
    }




    private static Student getRandomStudent() {
        Random random = new Random();
        int nameSize = random.nextInt(5, 10);
        String firstName = generateRandomNameString(nameSize);
        String lastName = generateRandomNameString(nameSize);
        Sex sex;
        if (nameSize % 2 == 0) {
            sex = Sex.MALE;
        } else {
            sex = Sex.FEMALE;
        }
        int age = random.nextInt(17, 23);
        return new Student(firstName, lastName, sex, age);
    }

    private static String generateRandomNameString(int size) {
        String alphaNumericStr = "qwertyuiopasdfghjklzxcvbnm";
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < random.nextInt(1, 5); j++) {
                result.append(alphaNumericStr.charAt(random.nextInt(0, alphaNumericStr.length())));
            }
        }
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        return result.toString();
    }


}
