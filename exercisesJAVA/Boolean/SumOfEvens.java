package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * upologizei to athroisma twn artiwn apo to 2
 * mexri ena orio pou dinei o xrhsths
 */

public class SumOfEvens {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int inputNumber = 0;
       int sum = 0;
       int i = 2;

        System.out.println("insert the limit that you want.");
        inputNumber = scanner.nextInt();

        while (i <= inputNumber) {
            sum += i;
            i += 2;
            System.out.println(sum);
        }

        System.out.println("the even number of " + inputNumber + " is: " + sum);
    }
}
