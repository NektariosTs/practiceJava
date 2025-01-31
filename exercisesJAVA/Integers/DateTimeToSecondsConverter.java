package exercisesJAVA.Integers;

import java.util.Scanner;

/**
 * metatrepei hmeres , wres , lepta , deuterolepta,
 * se sunolika deuterolepta. o xrhsths dinei ta dedomena
 * kai ektupwnei to teliko apotelesma
 */
public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        int hours;
        int minutes;
        int seconds;
        int totalSeconds = 0;
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 60 * 60;
        final int SEC_PER_MIN = 60;

        System.out.println("please insert Days , hours , minutes, seconds");
        days = scanner.nextInt();
        hours = scanner.nextInt();
        minutes = scanner.nextInt();
        seconds = scanner.nextInt();

        totalSeconds = days * SEC_PER_DAY + hours * SEC_PER_HOUR
                + minutes * SEC_PER_MIN + seconds;

        System.out.printf("%d days, %d hours %d minutes, %d seconds is: %d total seconds!", days, hours, minutes, seconds, totalSeconds);
    }
}
