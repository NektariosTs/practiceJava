package exercisesJAVA.chapter4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * throughout demo for.
 */
public class FlexibleFor {
    public static void main(String[] args) {
        int startValue = 0; // tria merh ths for
        int endValue = 0;
        int step;
        Scanner scanner = new Scanner(System.in);
        int iterations = 0;

        System.out.println("enter start, end, step");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}
