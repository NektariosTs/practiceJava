package exercisesJAVA.Integers;

import java.util.Scanner;

/**
 * na lambanei ws input apo ton xrhsth ena dhpsifio akeraio
 * kai na ektupwnei to athroisma twn psifiwn tou.
 * gia paradeigma an o xrhsths dwsei ton arithmo 15 , tha prepei
 * to apotemesma na einai 1 + 5 = 6
 */
public class DigitalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumDigits = 0;

        System.out.println("please insert two digits number");
        number = scanner.nextInt();
        leftDigit = number / 10;
        rightDigit = number % 10;
        sumDigits = leftDigit + rightDigit;

        System.out.printf("%d + %d = %d", leftDigit, rightDigit, sumDigits);
    }
}
