package com.ua.robot.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int cubeNumber = scanner.nextInt();
        System.out.println("The cube of the entered number is: " + getCubeNumber(cubeNumber));


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number of stars to print: ");
        int number = scanner1.nextInt();
        printSymbol(number);

        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter a consecutive number and any character: ");
        int number2 = scanner2.nextInt();
        String symbol = scanner3.nextLine();
        printSymbol(number2, symbol);

    }


    static int getCubeNumber(int a) {
        return a * a * a;
    }


    static void printSymbol(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    static void printSymbol(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }
}

