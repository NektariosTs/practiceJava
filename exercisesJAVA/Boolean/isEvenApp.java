package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * elegxei ean o arithmos einai artios
 * % 2 panta me to module menei apotelesma 2.
 * an theloume perito kanoume != 0 kai oxi ==(dhlwnei isothta)
 */
public class isEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isEven;

        System.out.println("please insert a number: ");
        num = scanner.nextInt();

        isEven = num % 2 == 0;

        System.out.printf("%d is even: %b ",num , isEven);
    }
}
//allos tropos xwris scanner alla me methodo.
//    public static boolean isEven(int i) {
//        return i % 2 == 0;