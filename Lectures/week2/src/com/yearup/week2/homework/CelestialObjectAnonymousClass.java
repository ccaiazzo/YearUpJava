package com.yearup.week2.homework;
import java.util.*;

public class CelestialObjectAnonymousClass implements week2.src.com.yearup.week2.homework.CelestialObject {

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
        Mercury,
        Venus,
        Earth,
        Mars,
        Jupiter,
        Saturn,
        Uranus,
        Neptune
    }

    public int displayMoons(String planetName) {
    return 2;
    }
}

