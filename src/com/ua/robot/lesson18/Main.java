package com.ua.robot.lesson18;

import com.ua.robot.lesson18.service.Numbers10Service;
import com.ua.robot.lesson18.service.Numbers2000000Service;
import com.ua.robot.lesson18.service.StudentArrayListService;
import com.ua.robot.lesson18.service.StudentLinkedListService;

import java.awt.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        Numbers10Service numbers10Service = new Numbers10Service();
        numbers10Service.printNumbers10();
        System.out.println();

        Numbers2000000Service numbers2000000Service = new Numbers2000000Service();
        numbers2000000Service.printNumbers2000000();


        StudentArrayListService studentArrayListService = new StudentArrayListService();
        studentArrayListService.printStudentArrayList();
        System.out.println();


        StudentLinkedListService studentLinkedListService = new StudentLinkedListService();
        studentLinkedListService.printStudentLinkedList();
    }
}
