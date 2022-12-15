package com.yearup.week4.homework;

import com.yearup.week4.code.linkedlist.SinglyLinkedList;
import java.util.*;

public class HomeWork {

    public static void generateTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    /**
     * takes a String input and returns a char array of reversed string
     *
     * @param input
     * @return
     */

    public static char[] reverseString(String input) {
        char[] out = new char[input.length()];
        int flag = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            out[flag] = input.charAt(i);
            flag += 1;
        }
        return out;
    }

    /**
     * returns true if element is contained in the array else false
     *
     * @param arr
     * @param element
     * @return
     */
    public static boolean containsElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * returns the sum of primary diagonal of given 2d int array n*n
     *
     * @param arr
     * @return
     */
    public static int diagonalSumOfArray(int[][] arr) {
        int sum = 0;
        String sumStatement = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sumStatement += arr[i][i] + " = ";
            } else
                sumStatement += arr[i][i] + " + ";
            sum += arr[i][i];
        }
        System.out.println(sumStatement);
        return sum;
    }

    public static int diagonalSumOfArraySecondary(int[][] arr) {
        int sum = 0;
        String sumStatement = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (i == arr.length - 1) {
                    sumStatement += arr[i][j] + " = ";
                } else
                    sumStatement += arr[i][i] + " + ";

                sum += arr[i][j];
            }


        }
        System.out.println(sumStatement);
        return sum;
    }

    /**
     *
     * @param start
     * @param total
     * @return
     */

    public static int[] getEvenElementsArray(int start, int total){
        int[] evenArray = new int[total];
        for (int i = 0; i<total; i++) {
            if (start % 2 == 0) {
                evenArray[i] = start + 2;
                start += 2;
            }
            else
                evenArray[i] = start + 1;

        }
        return evenArray;
    }

    /**
     *
     * @param start
     * @return
     */
    public static int[] progressivelyDecreasingArray(int start) {
        int[] decArray = new int[start];
        int flag = 1;
        decArray[0] = start;
        for (int i = 1; i < 10; i++) {
            decArray[i] = decArray[i-1] - flag;
            flag += 1;
        }
        return decArray;
    }

    /**
     *
     * @param arr
     * @param pos
     * @return
     */
    public static Object[] removeElement(int[] arr, int pos){
        List<int[]> testArray = Arrays.asList(arr);
        System.out.println("The array is currently: ");
        for (int i = 0; i < testArray.size(); i++) {
            System.out.println(testArray.get(i));
        }
        testArray.remove(pos);
        System.out.println("Array is now: ");
        for (int i = 0; i < testArray.size(); i++) {
            System.out.println(testArray.get(i));
        }
        Object[] newArray = testArray.toArray();
        return newArray;
    }


    /**
         *
         * @param arr player X ,player O
         * @return X, O or D for draw
         */
        public static char ticTacToeWinner ( char[][] arr){
            return 0;
        }
        /**
         * returns the array with duplicates removed
         * @param arr
         * @return
         */
        public static int[] removeDuplicates ( int[] arr){
            return null;
        }

        /**
         * returns the reversed linked list
         * @param input
         * @return
         */
        public static SinglyLinkedList<Integer> reverseLinkedList (SinglyLinkedList < Integer > input) {
            return null;
        }

        /**
         * implement this interface to create your own arraylist
         */
        interface MyArrayList {
            int size();

            void add(int element);

            int remove(int pos);
        }

        public static void main (String[]args){

            int[] out = {1,2,3,4,5,6};
            removeElement(out,3);
        }


    }
