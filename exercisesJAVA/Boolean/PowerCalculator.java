package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * upologizei to b^power
 */
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("isnsert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }
        System.out.println("result: " + result);
    }
}
