package exercisesJAVA.Integers;

import java.util.Scanner;

public class EurosApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputAmountOfEuros;
        int euros500 = 0;
        int euros100 = 0;
        int euros50 = 0;
        int euros20 = 0;
        int euros10 = 0;
        int euros5 = 0;
        int euro1 = 0;
        int remainingEuros;

        System.out.println("please insert an amount of money that you want to withdraw");
        inputAmountOfEuros = scanner.nextInt();

        remainingEuros = inputAmountOfEuros;

        euros500 = remainingEuros / 500;
        remainingEuros = remainingEuros % 500;

        euros100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euros50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euros20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euros10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        euros5 = remainingEuros / 5;
        remainingEuros = remainingEuros % 5;

        System.out.printf("%d euros = euros500: %d, euros100: %d, euros50: %d\n",inputAmountOfEuros, euros500, euros100, euros50);
        System.out.printf("euros20: %d, euros10: %d , euros5: %d, euros: %d",euros20, euros10, euros5, remainingEuros);

    }

}
