package com.javabasics;

public class MergeArraysLinear {

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] result = new int[a1.length + a2.length];

        int i = 0; //index for a1
        int j = 0; //index for a2

        for(int k=0; k < result.length; k++) {
            if(i < a1.length && j < a2.length) {
                if(a1[i] < a2[j]) {
                    result[k] = a1[i];
                    i++;
                }
                else {
                    result[k] = a2[j];
                    j++;
                }
            }
            else if(i >= a1.length) {
                result[k] = a2[j];
                j++;
            }
            else if(j >= a2.length) {
                result[k] = a1[i];
                i++;
            }
        }


        return result;
    }
}
