package exercisesJAVA.Boolean;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("please insert numerator(quit with numearotor = 0)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("numerator is zero . quiting...");
                break;
            }

            System.out.println("insert denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("denomiator is zero");
               continue;
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);


        }
    }
}

//            if (denominator != 0) {
//                if (numerator != 0) {
//                    result = numerator / denominator;
//                } else {
//                    System.out.println("numerator is zero");
//                    break;
//                }
//            } else {
//                System.out.println("denominator");
//                continue;
//            }