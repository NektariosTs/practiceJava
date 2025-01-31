package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * calculate n!
 * trexei ton pollaplasiasmo oses fores emeis tou poume. i + 1;mporume kai oso theloume na pollaplasiazoume to i
 * emeis to orizoume
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        int i = 1;
        int inputNum = 0;

        System.out.println("please insert an input number");
        inputNum = scanner.nextInt();

        while (i <= inputNum) {
//            factorial = factorial * i;
            factorial *= i;
            i++;
            System.out.println("factorial: " + factorial);
        }

    }
}
