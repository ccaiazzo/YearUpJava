package com.yearup.week2.homework;

import java.util.Scanner;

public class Executor {
    static Scanner sc = new Scanner(System.in);
    static com.yearup.week2.homework.SolarSystemPlanet andromeda = new SolarSystemPlanet();

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
/**
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
**/ CelestialObjectAnonymousClass.checkMoons();
    }

    public static class CelestialObjectAnonymousClass implements week2.src.com.yearup.week2.homework.CelestialObject {

        @Override
        public void displayCelestialObject() {
            System.out.println("Comet is a celestial object");
        }

        public static class MilkyWay {
            public void textDisplay() {
                System.out.println("Your planet belongs to Milky way galaxy.");
            }
        }

        enum PlanetName {
            MERCURY,
            VENUS,
            EARTH,
            MARS,
            JUPITER,
            SATURN,
            URANUS,
            NEPTUNE
        }

        public static int displayMoons(String planetName) {
            if (planetName.equalsIgnoreCase(PlanetName.MERCURY.name())) {
                return 0;
            }
            else if (planetName.equalsIgnoreCase(PlanetName.VENUS.name())) {
                return 0;
            }
            else if (planetName.equalsIgnoreCase(PlanetName.EARTH.name())) {
                return 1;
            }
            else if (planetName.equalsIgnoreCase(PlanetName.MARS.name())) {
                return 2;
            }
            else if (planetName.equalsIgnoreCase(PlanetName.JUPITER.name())) {
                return 80;
            }
            else if (planetName.equalsIgnoreCase(PlanetName.SATURN.name())) {
                return 83;
            }
            else if (planetName.equalsIgnoreCase(PlanetName.URANUS.name())) {
                return 27;
            }
            else if (planetName.equalsIgnoreCase(PlanetName.NEPTUNE.name())) {
                return 14;
            }
            else {
                System.out.println("Please enter a valid planet name.");
                return -1;
            }
        }

        public static void checkMoons() {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a planet name: ");
            System.out.print("Number of moons is " + displayMoons(input.nextLine()));
        }


    }


}
