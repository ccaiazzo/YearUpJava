package com.yearup.week2.homework;
import java.util.Scanner;

public class Executor {
    static Scanner sc = new Scanner(System.in);
    static SolarSystemPlanet andromeda = new SolarSystemPlanet();

    public static String getPlanetName() {
        System.out.println("Enter the planet name: ");
        String input = sc.nextLine();
        return input;
    }

    public static double getRadius() {
        System.out.println("Enter the planet radius: ");
        double input = sc.nextDouble();
        sc.nextLine();
        return input;
    }

    public static void displayArea(double area) {
        System.out.println("Area of the planet is " + area);
    }

    public static void getStar(SolarSystemPlanet planet1) {
        System.out.println("The star of the planet is " + planet1.getStar());
    }

    public static void getPos(SolarSystemPlanet planet1, String planetName) {
        int position = andromeda.getPos(planetName);
        System.out.println("The position of the planet is: " + position);
    }

    public static void main(String[] args) {
        boolean doAgain = false;
        do {
            doAgain = false;
            String planetName = getPlanetName();
            double radius = getRadius();
            double planetArea = andromeda.getArea(radius);
            displayArea(planetArea);
            getStar(andromeda);
            getPos(andromeda, planetName);

            System.out.println("Would you like to use the application again? ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                doAgain = true;
            }
            else {
                System.out.println("Thanks for using our planet application. Goodbye!");
            }
        } while(doAgain);

    }
}
