package com.ua.robot.lesson20.service;

import com.ua.robot.lesson20.repository.WordsMemoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordTranslationService {
    private final WordsMemoryRepository wordsMemoryRepository;

    public WordTranslationService() {
        this.wordsMemoryRepository = new WordsMemoryRepository();
    }

    public void wordTranslation() {
        System.out.println("Enter one of the ten proposed Ukrainian words and get translations into English, Japanese and German.");
        System.out.println("Input words: клас, об'єкт, пакет, масив, колекція, метод, абстракція, наслідування, інтерфейс, інкапсуляція");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String lowerWord = word.toLowerCase();
        List<String> translation = new ArrayList<>(wordsMemoryRepository.getValueByKey(lowerWord));
        System.out.println(translation);
    }
}
