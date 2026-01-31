package com.collectors.wordfrequencycounter;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String paragraph = "java is fun and java is powerful and java is popular";

        String[] words = paragraph.split("\\s+");

        Map<String, Integer> wordCount =
                Arrays.stream(words)
                      .collect(Collectors.toMap(
                          word -> word,      
                          word -> 1,         
                          Integer::sum       
                      ));

        System.out.println("Word Frequency:");
        wordCount.forEach(
            (word, count) -> System.out.println(word + " : " + count)
        );
    }
}
