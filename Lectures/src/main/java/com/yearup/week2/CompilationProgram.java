<<<<<<< HEAD
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please name a planet");
        String planet = sc.nextLine();
        if (planet.equals("Venus") || planet.equals("Mercury")) {
            System.out.println(planet + "is closer to the sun compared to the earth");
        } else if (planet.equals("Earth"))  {
            System.out.println(planet + "is your home planet");
        } else {
            System.out.println(planet + "is farther");
        }
    }
}
=======
package com.yearup.week2;

class CompilationProgram {
public static void main(String args[]) { 
int t; //This program wouldn't run as the value is not initialized. local variables need to be always initialized. 
//System.out.println(t);
} 
}
>>>>>>> 73091be561427aee7781eb11cdf2105e96531617
