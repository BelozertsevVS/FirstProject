package com.ua.robot.lesson17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ReturnEnumName returnEnumName = new EnumService();

        System.out.println("Enter the day of the week number from 1 to 7");
        returnEnumName.returnFullEnumName(scan.nextInt());
    }
}
