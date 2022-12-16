package main.java.com.yearup.week8.Homework;

import java.io.*;
import java.util.*;
public class StackReverse {
    public static String stringReverser(String testString) {
        char[] stringReversed = new char[testString.length()];
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < testString.length(); i++) {
            stack.push(testString.charAt(i));
        }

        int i = 0;
        while (!stack.isEmpty()) {
            stringReversed[i++] = stack.pop();
        }

        return new String(stringReversed);
    }

    public static void main(String[] args) {
        String string1 = "Test String";
    }
}
