package com.ua.robot.lesson20.repository;

import java.util.*;

public class WordsMemoryRepository {
    private final Map<String, List<String>> miniDictionary = new HashMap<>();

    public WordsMemoryRepository() {
        fillDictionary();
    }

    private void fillDictionary() {
        miniDictionary.put("клас", List.of("class", "クラス", "klasse"));
        miniDictionary.put("об'єкт", List.of("object", "物体", "objekt"));
        miniDictionary.put("пакет", List.of("package", "パッケージ", "paket"));
        miniDictionary.put("масив", List.of("array", "山塊", "massiv"));
        miniDictionary.put("колекція", List.of("collection", "コレクション", "kollektion"));
        miniDictionary.put("метод", List.of("method", "方法", "vorgehensweise"));
        miniDictionary.put("абстракція", List.of("abstraction", "抽象化", "abstraktion"));
        miniDictionary.put("наслідування", List.of("imitation", "模倣", "nachahmung"));
        miniDictionary.put("інтерфейс", List.of("interface", "インターフェース", "schnittstelle"));
        miniDictionary.put("інкапсуляція", List.of("encapsulation", "カプセル化", "verkapselung"));
    }

    public List<String> getValueByKey(String word) {
        List<String> wordTranslation = new ArrayList<>(miniDictionary.get(word));
        return wordTranslation;
    }

    @Override
    public String toString() {
        return "WordsMemoryRepository{" +
                "miniDictionary=" + miniDictionary +
                '}';
    }
}
