package com.javabasics;

import com.javabasics.Factorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //int value = Integer.parseInt(args[0]);

        int[] a1 = new int[]{1, 2, 3, 5};
        int[] a2 = new int[]{1, 4};
        int[] result = MergeArraysLinear.mergeArrays(a1, a2);

        System.out.println(Arrays.toString(result));

    }
}