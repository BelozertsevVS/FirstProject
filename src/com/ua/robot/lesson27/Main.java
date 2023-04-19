package com.ua.robot.lesson27;

import com.ua.robot.lesson27.service.StringRecordingAndReadingService;

public class Main {
    public static void main(String[] args) {

        StringRecordingAndReadingService srr = new StringRecordingAndReadingService();
        srr.stringRecordingToFile();
        srr.stringReadFromFile();

    }
}
