package com.yearup.week2.homework;
import java.util.Scanner;

public class SquareArea implements Calculator {
    private double areaVal;
    private double sideLength;

    @Override
    public double getArea(double num1, double num2) {
        this.areaVal = num1*num2;
        return this.areaVal;
    }

    public void displayArea() {
        System.out.println("The area of the square is: " + areaVal);
    }

    public void setLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a length value: ");
        this.sideLength = sc.nextDouble();
    }

    @Override
    public double getSum(double num1, double num2) {
        return 0;
    }

    @Override
    public double getVolume(double num1, double num2, double num3) {
        return 0;
    }

    public static void main(String[] args) {
        SquareArea areaCalc = new SquareArea();
        areaCalc.setLength();
        final double AREA = areaCalc.getArea(areaCalc.sideLength,areaCalc.sideLength);
        areaCalc.displayArea();
    }
}
