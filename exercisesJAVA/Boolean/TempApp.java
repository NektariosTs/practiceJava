package exercisesJAVA.Boolean;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * lambanei mia thermokrasia apo ton xrhsth
 * kai emfanizei katallhlo mhnuma
 */

public class TempApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowToZero = false;

        System.out.println("please insert the current temperature");
        temp = scanner.nextInt();

        isTempBelowToZero = temp < 0;

        System.out.println("h thermokrasia einai upo to 0: " + isTempBelowToZero);
    }
}
