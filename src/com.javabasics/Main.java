package com.javabasics;

import com.javabasics.TextPerRole;

import static com.javabasics.TextPerRole.printTextPerRole;

import com.javabasics.commentAnalyzer.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTrace = new Throwable("throwable").getStackTrace();
        if(stackTrace.length < 3) return null;
        else {
            return stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName();
        }
    }

}