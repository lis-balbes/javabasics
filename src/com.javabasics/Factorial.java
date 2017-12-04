package com.javabasics;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int value) {
        BigInteger factorial = BigInteger.ONE;
        for(int i = 2; i <= value; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
