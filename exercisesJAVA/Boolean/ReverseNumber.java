package exercisesJAVA.Boolean;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int reversed = 0;
        int rightDigit = 0;
        int tempNumber = 0;

        System.out.println("insert an integer");
        inputNum = scanner.nextInt();

        tempNumber = inputNum;

        while (tempNumber > 0) {
            rightDigit = tempNumber % 10;
            reversed = reversed * 10 + rightDigit;
            tempNumber /= 10; //tempNum = tempNum / 10;

            System.out.println(reversed);
        }

    }
}
