package com.javabasics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

public class WordCountsWithStreams {

    public static void main(String[] args) {

        //Read from System.in and check encoding
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in , StandardCharsets.UTF_8));


        //Create stream, split it to stream of words and collect it to map with word counts + lowercasing
        Map<String, Long> groupedMap = input.
                lines().
                map(x -> x.toLowerCase().split("[^a-zA-Zа-яА-Я0-9']+")).
                flatMap(Arrays::stream).
                collect(groupingBy(Function.identity(), Collectors.counting()))
        ;

        //Create new stream from map with counts, reverse its order and add additional lexicographical sorting
        Map<String, Long> sortedMap = groupedMap.entrySet().stream().
                sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.<String,Long>comparingByKey(Comparator.naturalOrder()))).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //Print 10 first words from sorted map
        sortedMap.keySet().stream().limit(10).forEach(System.out::println);
    }
}
