package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * yparxei ena secret arithmos integer kai o xrhsths
 * me mia mono prospatheia tha prospathhsei na ton brei.
 */

public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("insert the num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!");
        }else{
            System.out.println("failure.");
        }
    }
}
