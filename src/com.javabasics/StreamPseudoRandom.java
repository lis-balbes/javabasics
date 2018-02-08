package com.javabasics;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPseudoRandom {

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> ((x*x)/10) % 1000);
    }
}
