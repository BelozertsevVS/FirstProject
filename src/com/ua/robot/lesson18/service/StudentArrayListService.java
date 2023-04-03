package com.ua.robot.lesson18.service;

import com.ua.robot.lesson18.repository.StudentMemoryRepositoryWithArrayList;

public class StudentArrayListService {
    private final StudentMemoryRepositoryWithArrayList studentMemoryRepositoryWithArrayList;

    public StudentArrayListService() {
        this.studentMemoryRepositoryWithArrayList = new StudentMemoryRepositoryWithArrayList();

    }

    public void printStudentArrayList() {
        System.out.println("Storing a list of Student with 10 elements using ArrayList:");
        for (int i = 0; i < 10; i++) {
            System.out.print(studentMemoryRepositoryWithArrayList.get(i));
        }
        System.out.println();
    }
}
