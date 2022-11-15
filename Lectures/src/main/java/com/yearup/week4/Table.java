package com.yearup.week4;
import java.util.Scanner;

public class Table {
    public static void generateTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to generate the table: ");
        int tableNumber = input.nextInt();
        generateTable(tableNumber);
    }
}
