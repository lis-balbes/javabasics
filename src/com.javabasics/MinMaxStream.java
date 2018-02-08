package com.javabasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxStream {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        ArrayList<T> list = new ArrayList<>(stream.sorted(order).collect(Collectors.toList()));
        if(list.isEmpty()) {
            minMaxConsumer.accept(null,null);

        }
        else {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        }
    }
}