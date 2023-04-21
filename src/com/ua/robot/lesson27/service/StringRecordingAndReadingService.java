package com.ua.robot.lesson27.service;

import java.io.*;
import java.util.Scanner;

public class StringRecordingAndReadingService {

    public void stringRecordingToFile() {
        System.out.println("Please enter a file name in the format *.txt ");
        Scanner scanner1 = new Scanner(System.in);
        String fileName = scanner1.nextLine();
        try (OutputStream os = new FileOutputStream(fileName);
             OutputStreamWriter osw = new OutputStreamWriter(os)) {
            System.out.println("Please enter the text to be written to the file");
            Scanner scanner2 = new Scanner(System.in);
            String text = scanner2.nextLine();
            osw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String stringReadFromFile() {
        System.out.println("Great! Now let's read the text from the file. " +
                "Please write the file name in the format *.txt");
        Scanner scanner1 = new Scanner(System.in);
        String fileName = scanner1.nextLine();
        try (InputStream is = new FileInputStream(fileName)) {
            byte[] data = is.readAllBytes();
            String dataString = new String(data);
            System.out.println("Here is the text in the file you provided: " + dataString);
            return dataString;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
