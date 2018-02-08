package com.javabasics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionTaskWithListOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque();

        int i = 0;

        while(sc.hasNextInt()) {
            int nextInt = sc.nextInt();
            if(i %2 != 0) {
                deque.add(nextInt);
            }
            i++;
        }

        for(Iterator iter = deque.descendingIterator(); iter.hasNext();) {
            System.out.print(iter.next() + " ");
        }
    }
}
