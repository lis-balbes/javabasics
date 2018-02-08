package com.javabasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        Set<Integer> resultSet = symmetricDifference(set1, set2);
        for(Integer i: resultSet) {
            System.out.print(i + " ");
        }
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> set1Copy = new HashSet<>(set1);
        Set<T> set2Copy = new HashSet<>(set2);

        Set<T> intersection = new HashSet<>(set1Copy);
        intersection.retainAll(set2Copy);

        set1Copy.removeAll(intersection);
        set2Copy.removeAll(intersection);

        Set<T> result = new HashSet<>();
        result.addAll(set1Copy);
        result.addAll(set2Copy);


        return result;

    }
}
