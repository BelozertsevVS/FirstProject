package com.ua.robot.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Program for finding the greater of two numbers");
        System.out.println();

        int number1 = 0;
        int number2 = 0;
        System.out.println("Enter any integer: ");
        Scanner scan1 = new Scanner(System.in);
        number1 = scan1.nextInt();
        System.out.println("Enter another integer: ");
        Scanner scan2 = new Scanner(System.in);
        number2 = scan2.nextInt();
        if (number1 > number2) {
            System.out.println("The number" + " " + number1 + " " + "is greater !");
        } else if (number1 < number2) {
            System.out.println("The number" + " " + number2 + " " + "is greater !");
        } else {
            System.out.println("The numbers are equal");
        }

        System.out.println();
        System.out.println("Program for finding the smallest of two numbers");
        System.out.println();

        System.out.println("Enter any integer: ");
        Scanner scan3 = new Scanner(System.in);
        number1 = scan3.nextInt();
        System.out.println("Enter another integer: ");
        Scanner scan4 = new Scanner(System.in);
        number2 = scan4.nextInt();
        if (number1 < number2) {
            System.out.println("The number" + " " + number1 + " " + "is smallest !");
        } else if (number1 > number2) {
            System.out.println("The number" + " " + number2 + " " + "is smallest !");
        } else {
            System.out.println("The numbers are equal");
        }

        System.out.println();
        System.out.println("Program for checking a given number for parity");
        System.out.println();

        int number3 = 0;
        System.out.println("Enter any integer: ");
        Scanner scan5 = new Scanner(System.in);
        number3 = scan5.nextInt();
        if (number3 % 2 == 0) {
            System.out.println("The number you entered is paired");
        } else System.out.println("The number you entered is not paired");
    }
}
