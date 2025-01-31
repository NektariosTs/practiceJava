package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * ypologizei to athroisma twn pshfiwn enos
 * akeraiou.Gia paradeigma to athroisma twn pshfiwn tou 123 einai 6.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int sum = 0;
        int rightDigit = 0;
        int tempNumber = 0;

        System.out.println("insert an integer");
        inputNumber = scanner.nextInt();

        tempNumber = inputNumber;

        while (tempNumber > 0) {
            rightDigit = tempNumber % 10;
            sum += rightDigit; //sum = sum + rightdigit
            tempNumber /= 10;  //tempnum = tempnum / 10;

            System.out.println(sum);
        }

    }
}
