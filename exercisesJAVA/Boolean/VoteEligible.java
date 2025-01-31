package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * dikaiwma psifou se hlikies > 18
 * elegxei an mia hlikia exei dikaiwma na psifisei
 * */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        final int AGE_OF_VOTING = 18;
        boolean isEligible = false;

        System.out.println("please insert your age");
        age = scanner.nextInt();

        isEligible = age >= AGE_OF_VOTING;

        System.out.println("you are able to vote: " + isEligible);
    }
}
