package exercisesJAVA.Integers;

import java.util.Scanner;

public class MathPow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("please insert a number");
        num = scanner.nextInt();

//        num = (int) Math.pow(num, 2);
        num = (int) Math.pow(num, 3);

        System.out.printf("square %d",num);
    }
}
