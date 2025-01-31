package exercisesJAVA.Integers;

import java.util.Scanner;

/**
 * metatrepei eurw se dolaria
 */
public class EurosUsdConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuros;
        int usaDollars = 0;
        int usaCents = 0;
        int totalUsaCents = 0;
        final int PARITY = 99;

        System.out.println("please insert a euro");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros, %d dollars and %d cents ",inputEuros, usaDollars, usaCents);
    }
}
