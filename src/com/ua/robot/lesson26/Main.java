package com.ua.robot.lesson26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            squareNumber();
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
    }


    private static int squareNumber() throws NegativeNumberException {
        int result = 0;
        System.out.println("Enter any integer");
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextInt();
        if (result < 0) {
            throw new NegativeNumberException("Entered number is negative");
        }
        result = result * result;
        System.out.println(result);

        return result;
    }
}
