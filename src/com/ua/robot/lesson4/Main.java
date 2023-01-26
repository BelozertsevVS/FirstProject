package com.ua.robot.lesson4;

public class Main {
    public static void main(String[] args) {
        String hw = "Hello World";
        System.out.println(hw.toUpperCase());
        System.out.println(hw.toLowerCase());
        System.out.println(hw.charAt(0));
        int length = hw.length();
        int lastIndex = length-1;
        System.out.println(hw.charAt(lastIndex));
    }
}
