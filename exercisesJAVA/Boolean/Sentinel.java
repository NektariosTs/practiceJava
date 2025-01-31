package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * Calculate the positvies count
 */

public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int positiveCount = 0;

        System.out.println("please insert a num");
        inputNumber = scanner.nextInt();

        while (inputNumber >= 0) {
            positiveCount++;
            System.out.println("please insert a num");
            inputNumber = scanner.nextInt();
        }
        System.out.println("Positives: " + positiveCount);
    }
}
