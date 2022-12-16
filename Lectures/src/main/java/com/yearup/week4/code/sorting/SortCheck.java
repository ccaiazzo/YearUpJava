package com.yearup.week4.code.sorting;

public class SortCheck {
    public static void main(String[] args) {
        int[] example = {12, 53, 89, 2};
        System.out.println(isSmallest(example));
    }
    public static boolean isSorted(int[] arr) {
        int[] sortedArr = arr;
        for(int i=0; i<sortedArr.length-1; i++) {
            for(int j=0; j<sortedArr.length-1-i; j++)
                if (sortedArr[j] > sortedArr[j + 1]) {
                    //swap
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                }
        }
        return arr.equals(sortedArr);
    }
    public static int isSmallest(int[] arr) {
        int smallest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                smallest = arr[i];
            }
            if (i > 0) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
        } return smallest;
    }
}


