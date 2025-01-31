package exercisesJAVA.Integers;

import java.util.Scanner;

/**
 * rixnei mia tuxaia zaria me 2 zaria
 */
public class RandomDiceApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int die1;
        int die2;



        die1 = (int) (Math.random() * 6 + 1);
        die2 = (int) (Math.random() * 6 + 1);

        System.out.printf("Die1: %d, Die2: %d", die1, die2);
    }
}
