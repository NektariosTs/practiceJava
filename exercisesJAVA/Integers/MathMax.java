package exercisesJAVA.Integers;

import java.util.Scanner;

/**
 * vriskei ton megisto triwn akeraiwn pou dinei o xrhsths.
 */
public class MathMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int finalNumber = 0;

        System.out.println("please insert 3 numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        finalNumber = Math.max(num1, Math.max(num2, num3));

        System.out.printf("Max is: %d ", finalNumber);

    }
}
