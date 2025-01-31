package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * demo of ternary operator on a common use case,
 * that is conditional assigment.
 * abs(num) always positive.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.println("please enter num");
        num = scanner.nextInt();
//        if (num >= 0) abs = num;
//        else abs = -num;
        //Ternary operator
        abs = (num >= 0) ? num : -num;

        System.out.println("abs: " + abs);
    }
}
