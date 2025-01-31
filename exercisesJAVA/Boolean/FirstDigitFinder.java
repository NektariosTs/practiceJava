package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * briskei to prwto aristero psifio
 * enos akeraiou
 */

public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int tempNumber = 0;

        System.out.println("insert an intiger");
        inputNumber = scanner.nextInt();

        tempNumber = inputNumber;

        while (tempNumber > 10) {
            tempNumber /= 10; // tempNum = tempNum / 10;
        }
        System.out.println("the first digit of: " + inputNumber + " is: " + tempNumber);
    }
}
