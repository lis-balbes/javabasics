package com.javabasics;

import java.util.Arrays;

public class AsciiCharSequence implements java.lang.CharSequence {

    private byte[] byteArray;

    public AsciiCharSequence(byte[] bytes) {
        byteArray = new byte[bytes.length];
        for(int i = 0; i < bytes.length; i++) {
            byteArray[i] = bytes[i];
        }

        //This was badly implemented constructor (it allowed to change private field), it was replaced with version above
        //this.byteArray = bytes;
    }

    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArray[index];
    }

    //Solution with Arrays.copyOfRange() did not pass time limit
    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] result = new byte[end - start];
        for(int i = 0; i < (end - start); i++) {
            result[i] = byteArray[i + start];
        }
        
        return new AsciiCharSequence(result);

    }

    //Solution without StringBuilder did not pass time limit
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < byteArray.length; i++) {
            result.append((char) byteArray[i]);
        }
        return result.toString();
    }
}
