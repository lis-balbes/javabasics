package com.javabasics;

import java.io.IOException;
import java.util.Scanner;

public class DoubleSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0.0;

        while (sc.hasNext()) {
            try {
                Double.parseDouble(sc.next());
            }
            catch (Throwable T) {}
        }

        System.out.format("%.6f", result);
    }
}
