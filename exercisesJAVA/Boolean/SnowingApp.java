package exercisesJAVA.Boolean;

import java.util.Scanner;

/*
Snowing if raining AND temp < 0
*/
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("please insert if its raining");
        isRaining = scanner.nextBoolean();

        System.out.println("please insert the temperature");
        temp = scanner.nextInt();

        isSnowing = isRaining && temp < 0;

        System.out.println("Is Snowing: " + isSnowing);
    }
}
