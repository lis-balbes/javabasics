package com.javabasics;


import java.io.*;

public class WindowsUnixEndOfLine {

    public static void main(String[] args) throws IOException {


        /*
        //Open files and streams
        File in = new File("resources/System.in");
        if (!in.exists()) {
            in.createNewFile();
        }
        File out = new File("resources/System.out");
        if (!out.exists()) {
            out.createNewFile();
        }

        InputStream in_stream = new FileInputStream(in);
        OutputStream out_stream = new FileOutputStream(out);
        */

        //Analyse input stream and make output
        int currentByte;
        int previousByte = System.in.read();

        while(previousByte != -1) {
            currentByte = System.in.read();

            if(previousByte == '\r' && currentByte == '\n') {
                System.out.write('\n');
                previousByte = System.in.read();
            }

            else {
                System.out.write(previousByte);
                previousByte = currentByte;
            }


        }

        System.out.flush();

    }
}
