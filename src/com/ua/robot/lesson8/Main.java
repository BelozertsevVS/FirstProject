package com.ua.robot.lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int length = 10;
        int[] arr = new int[length];


        fillArrayWithRandomNumber(arr, 100);
        System.out.println("Our program takes an array of 10 elements and fills it with random numbers: ");
        printArray(arr);
        System.out.println();


        System.out.println();
        int min = getMinimumValueInArray(arr);
        System.out.println("The minimum value in the array: " + min);


        System.out.println();
        int max = getMaximumValueInArray(arr);
        System.out.println("The maximum value in the array: " + max);


        System.out.println();
        double average = getAverageValue(arr);
        System.out.println("Average value: " + average);


        System.out.println();
        int sum = getSumOfAllArrayElements(arr);
        System.out.println(sum);

    }


    static void fillArrayWithRandomNumber(int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
    }


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int getMinimumValueInArray(int[] arr) {
        int minResult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minResult) {
                minResult = arr[i];
            }
        }
        return minResult;
    }

    static int getMaximumValueInArray(int[] arr) {
        int maxResult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxResult) {
                maxResult = arr[i];
            }
        }
        return maxResult;
    }

    static double getAverageValue(int[] arr) {
        double result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result += arr[i];

        }
        return result / arr.length;
    }

    static int getSumOfAllArrayElements(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

}







