package exercisesJAVA.chapter4;

import java.util.Scanner;

/**
 * switch-case is fall-through and can be used
 * as a logical OR
 */
public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        System.out.println("enter a grade");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error in grade");
                break;
        }
    }
}
