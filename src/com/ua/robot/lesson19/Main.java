package com.ua.robot.lesson19;

import com.ua.robot.lesson19.service.NumberHashSetService;
import com.ua.robot.lesson19.service.NumberLinkedHashSetService;
import com.ua.robot.lesson19.service.NumberTreeSetService;

public class Main {
    public static void main(String[] args) {

        NumberHashSetService numberHashSetService = new NumberHashSetService();
        numberHashSetService.printNumbers();

        NumberLinkedHashSetService numberLinkedHashSetService = new NumberLinkedHashSetService();
        numberLinkedHashSetService.printNumbers();

        NumberTreeSetService numberTreeSetService = new NumberTreeSetService();
        numberTreeSetService.printNumbers();

    }
}
