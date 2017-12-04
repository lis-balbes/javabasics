package com.javabasics;

public class TextPerRole {

    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder[] resultArray = new StringBuilder[roles.length];

        for(int i = 0; i < roles.length; i++) {
            resultArray[i] = new StringBuilder("");
            resultArray[i].append(roles[i]).append(":\n");
        }

        //parse role from text line
        for(int i = 0; i < textLines.length; i++) {
            for(int j = 0; j < roles.length; j++) {
                if(textLines[i].startsWith(roles[j] + ":")) {
                    //add this text line to role
                    StringBuilder line = new StringBuilder(textLines[i].substring(textLines[i].indexOf(": ") + 2));

                    resultArray[j].append(Integer.toString(i+1)).append(") ").append(line).append("\n");

                }
            }

        }

        for(int i = 0; i < roles.length; i++) {
            resultArray[i].append("\n");
        }

        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < resultArray.length; i++) {
            result = result.append(resultArray[i]);
        }

        return result.toString();
    }
}
