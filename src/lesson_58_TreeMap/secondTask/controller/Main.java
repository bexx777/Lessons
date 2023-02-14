package lesson_58_TreeMap.secondTask.controller;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "конь мухомор курица сундук конь курица пшено ячмень река конь ";
        String[] words = input.split(" ");
        HashSet<String> wordSet = new HashSet<>(List.of(words));
        System.out.println(wordSet);
        HashMap<String, Integer> numbs = new HashMap<>();
        // Первый.
        for (String word : wordSet) {
            numbs.put(word, 0);
        }
        System.out.println(numbs);
        for (String word : words) {
            int counts = numbs.get(word) + 1;
            numbs.put(word, counts);
        }
        System.out.println("*".repeat(100));
        System.out.println(numbs);
        // Второй
        for (String word1 : words) {
            if (numbs.containsKey(word1)) {
                numbs.put(word1, 1);
            } else {
                numbs.put(word1, numbs.get(word1) + 1);
            }
        }
        System.out.println("*".repeat(100));
        // Третий
        Set<String> result = new HashSet<>(List.of(words));
        for (String key : result) {
            numbs.put(key, Collections.frequency(List.of(words), key));
        }
        System.out.println(numbs);
    }
//0.5
//        int n = 0;
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].equalsIgnoreCase(wordSet.toString())) {
//                n++;
//
//            }
//            System.out.println(nums.put(words[i], n));
}
