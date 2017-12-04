package com.javabasics;

import com.javabasics.TextPerRole;

import static com.javabasics.TextPerRole.printTextPerRole;

public class Main {

    public static void main(String[] args) {

        //int value = Integer.parseInt(args[0]);
        //int[] a1 = new int[]{1, 2, 3, 5};
        //int[] a2 = new int[]{1, 4};

        String [] roles = {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String result = printTextPerRole(roles, textLines);

        System.out.println(result);

    }
}