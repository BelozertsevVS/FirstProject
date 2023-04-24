package com.ua.robot.lesson28.cervice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class StringRecordingAndReadingService {

    public void stringRecordingToFile() {
        String folder = createFolder();
        Path pathFolder = Path.of(folder);
        System.out.println("Now write the text the name of the file to be created in *.txt format");
        Scanner scanner1 = new Scanner(System.in);
        String fileName = scanner1.nextLine();
        Path filePath = Path.of(pathFolder.toString(), fileName);
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Great! Such file already exists");
            System.out.println("Write the text you want to save to a file");
            Scanner scanner2 = new Scanner(System.in);
            String text = scanner2.nextLine();
            try {
                Files.write(pathFolder.resolve(fileName), text.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Write the text you want to save to a file");
            Scanner scanner2 = new Scanner(System.in);
            String text = scanner2.nextLine();
            try {
                Files.write(pathFolder.resolve(fileName), text.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public String stringReadFromFile() {
        System.out.println("Great! Now let's read the text from the file. Please write the file name in the format *.txt\"");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            String result = Files.readString(Path.of(fileName));
            System.out.println("Here is the text that is written in the file: " + result);
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String createFolder() {
        System.out.println("Please enter the name of the folder you want to create");
        Scanner scanner = new Scanner(System.in);
        String folderName = scanner.nextLine();
        Path pathToFolder = Path.of(folderName);
        var isExist = Files.exists(pathToFolder);
        if (!isExist) {
            try {
                Files.createDirectories(pathToFolder);
                System.out.println("Great! Folder " + folderName + " created");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Great! This folder already exists");
        }
        return folderName;
    }
}
