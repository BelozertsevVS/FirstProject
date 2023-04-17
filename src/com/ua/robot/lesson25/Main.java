package com.ua.robot.lesson25;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            try {
                numberEntry();
                break;
            } catch (LetterEntryException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    private static void numberEntry () throws LetterEntryException {
        System.out.println("Please enter any integer");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                throw new LetterEntryException(input + " not a number");
            }
        }
        int number = Integer.parseInt(input);
        System.out.println("Everything is fine! Entered number " + number);
    }
}

