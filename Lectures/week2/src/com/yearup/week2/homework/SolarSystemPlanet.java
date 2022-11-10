package com.yearup.week2.homework;

public class SolarSystemPlanet extends Planet {
    private String star = "SUN";

    @Override
    public String getStar() {
        return this.star;
    }

    public int getPos(String planet) {
        switch(planet) {
            case "Mercury":
                return 1;
            case "Venus":
                return 2;
            case "Earth":
                return 3;
            case "Mars":
                return 4;
            case "Jupiter":
                return 5;
            case "Saturn":
                return 6;
            case "Uranus":
                return 7;
            case "Neptune":
                return 8;
            default:
                return 0;
        }
    }
}
