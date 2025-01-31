package exercisesJAVA.Integers;

import java.util.Scanner;

/**
 * convert years (ages) to days
 * metatroph xronwn se meres
 */
public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int days = 0;
        final int DAYS_PER_YEAR = 365;

        System.out.println("please insert an age");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        System.out.println("Age is: " + age + ", Days is: " + days);
        System.out.printf("Age is: %d and days is: %d ", age, days);
    }
}
