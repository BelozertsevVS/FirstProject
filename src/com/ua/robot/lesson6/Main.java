package com.ua.robot.lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program for displaying numbers from 1 to 10: ");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Display all even numbers between 1 and 100: ");
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Find the factorial of the number 7: ");
        int factorial = 1;
        for (int i = 1; i <= 7; i++) {
            factorial = factorial * i; // factorial *= i
        }
        System.out.println(factorial);

        System.out.println("Output Fibonacci numbers up to 100 (the value of the number itself should not exceed 100): ");
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        do {
            if (f0 == 0 && f1 == 1) {
                System.out.print(f0 + " " + f1 + " ");
            }
            fn = f0 + f1;
            if (fn < 100) {
                System.out.print(fn + " ");
            }
            f0 = f1;
            f1 = fn;
        } while (fn < 100);
    }
}




