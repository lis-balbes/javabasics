package com.javabasics;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ReadAsString {

    public static void main(String[] args) {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder resultBuilder = new StringBuilder();

        InputStreamReader reader = new InputStreamReader(inputStream, charset);

        int currentByte = reader.read();
        while(currentByte != -1) {
            resultBuilder.append((char)currentByte);
            currentByte = reader.read();
        }


        return resultBuilder.toString();
    }
}
