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