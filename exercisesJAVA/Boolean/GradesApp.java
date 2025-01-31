package exercisesJAVA.Boolean;

import java.util.Scanner;

/**
 * o xrhsths tha dinei:
 * 1.tous sunolikous vathmous mathimatwn
 * 2.to plithos twn mathimatwn
 * <p>
 * tha upologizei ton meso oro kai tha xaraktirizei
 * "arista" an o mesos oros einai >=9,
 * "polu kala" an o mesos oros einai >= 7,
 * "kalws" an o mesos oros einai >=5
 * "apotuxia" an o mesos oros einai < 5
 *
 * Ta USECASES PREPEI NA ELEGXONTAI
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;


        System.out.println("insert the total marks of lessons");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("total marks must not be negative or zero");
            System.exit(1);// vgainei ap to programma
        }

        System.out.println("insert the coursesCount.");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error.the average must be less or equal to 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Arista");
        } else if (average >= 7) {
            System.out.println("polu kala");
        } else if (average >= 5) {
            System.out.println("kala");
        }else {
            System.out.println("failure");
        }

        System.out.println("average is: " + average);

    }
}
