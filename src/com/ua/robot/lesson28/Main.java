package com.ua.robot.lesson28;

import com.ua.robot.lesson28.cervice.StringRecordingAndReadingService;

public class Main {
    public static void main(String[] args) {

        StringRecordingAndReadingService srrs = new StringRecordingAndReadingService();
        srrs.stringRecordingToFile();
        srrs.stringReadFromFile();
    }
}
