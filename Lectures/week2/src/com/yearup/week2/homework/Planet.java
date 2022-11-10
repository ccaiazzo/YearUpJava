package com.yearup.week2.homework;

public class Planet implements Calculator {
    protected String star;
    private String planetName;
    private double planetRadius;

    public String getStar() {
        return this.star;
    }

    @Override
    public double getArea(double num1, double num2) {
        return Math.PI * Math.pow(this.planetRadius,2);
    }

    public double getArea(double num1) {
        return Math.PI * Math.pow(num1, 2);
    }

    @Override
    public double getSum(double num1, double num2) {
        return 0;
    }

    @Override
    public double getVolume(double num1, double num2, double num3) {
        return 0;
    }
}
