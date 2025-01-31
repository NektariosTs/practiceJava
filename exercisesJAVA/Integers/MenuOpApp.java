package exercisesJAVA.Integers;

import java.util.Scanner;

/**
 * ektelei aples arithmitikes prakseis se duo akeraiaous.
 */
public class MenuOpApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        System.out.println("please insert two numbers");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.printf("Sum: %d\n", num1 + num2);
        System.out.printf("Sub: %d\n", num1 - num2);
        System.out.printf("Mul: %d\n", num1 * num2);
        System.out.printf("Div: %d\n", num1 / num2);
        System.out.printf("Mod: %d\n", num1 % num2);

    }
}
