package exercisesJAVA.Integers;

import java.util.Scanner;

/**
 * convert miles to km
 * metartoph milia se xiliometra
 */
public class MilesToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double miles = 0;
        double kilometers = 0;
        final double MILES_PER_KILOMETERS = 1.6;

        System.out.println("plese insert miles");
        miles = scanner.nextDouble();

        kilometers = miles * MILES_PER_KILOMETERS;

        System.out.println("Miles is: " + miles + "KM is: " + kilometers);
        System.out.printf("Miles is: %s, KM is: %s", miles, kilometers);

    }
}
