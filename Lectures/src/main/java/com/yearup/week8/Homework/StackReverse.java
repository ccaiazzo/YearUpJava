package com.yearup.week8.Homework;

import java.io.*;
import java.util.*;
public class StackReverse {
    public static String stringReverser(String testString) {
        char[] stringReversed = new char[testString.length()];
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < testString.length(); i++) {
            stack.push(testString.charAt(i));
        }

        int j = 0;
        while (!stack.isEmpty()) {
            stringReversed[j++] = stack.pop();
        }

        return String.valueOf(stringReversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to test the reverser with: ");
        String string1 = sc.nextLine();
        System.out.println("Reversed string: " + stringReverser(string1));

        String string2 = "Chris Caiazzo";

        System.out.println("Original string: " + string2);
        System.out.println("Reversed string: " + stringReverser(string2));
    }
}
