package com.ua.robot.lesson18.service;

import com.ua.robot.lesson18.repository.StudentMemoryRepositoryWithLinkedList;

public class StudentLinkedListService {
private final StudentMemoryRepositoryWithLinkedList studentMemoryRepositoryWithLinkedList;
    public StudentLinkedListService() {
        this.studentMemoryRepositoryWithLinkedList = new StudentMemoryRepositoryWithLinkedList();
    }

    public void printStudentLinkedList() {
        System.out.println("Storing a list of Student with 10 elements using LinkedList:");
        for (int i = 0; i < 10; i++) {
            System.out.print(studentMemoryRepositoryWithLinkedList.get(i));
        }
        System.out.println();
    }
}
