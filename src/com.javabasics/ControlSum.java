package com.javabasics;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ControlSum {

    public static void main(String[] args) throws IOException {
        byte[] bytes = {33, 45, 01};
        InputStream is = new ByteArrayInputStream(bytes);

        System.out.println(checkSumOfStream(is));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int currentByte = inputStream.read();
        while(currentByte >= 0) {
            sum = Integer.rotateLeft(sum, 1) ^ currentByte;
            currentByte = inputStream.read();
        }

        return sum;

    }

}
