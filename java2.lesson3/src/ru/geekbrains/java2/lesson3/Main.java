package ru.geekbrains.java2.lesson3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[] {
                "Maks", "Salo", "Voda", "Planeta", "Police", "Deti", "Samolet", "Kirill", "Planeta", "Salo"
        };

        List<String> batchOfWords = new ArrayList<>();
        for (String w : words) {
            batchOfWords.add(w);
        }

        System.out.println(batchOfWords);

        Set<String> uniqueWords = new HashSet<>();
        for (String w : batchOfWords) {
            uniqueWords.add(w);
        }

        System.out.println(uniqueWords);

        Map<String, Integer> wordCounter = new HashMap<>();
        for (String w : batchOfWords) {
            if (wordCounter.containsKey(w)) {
                Integer count = wordCounter.get(w);
                count++;
                wordCounter.put(w, count);
            } else {
                wordCounter.put(w, 1);
            }
        }

        System.out.println(wordCounter);
    }
}

