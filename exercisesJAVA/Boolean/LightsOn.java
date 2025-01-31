package exercisesJAVA.Boolean;

import java.util.Scanner;

/*
 * Turn lights on,if it is raining AND car is running (>100) OR is dark.
 */
public class LightsOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isLightsOn;
        boolean isRunning;
        int carSpeed = 0;

        System.out.println("please insert if its raining");
        isRaining = scanner.nextBoolean();

        System.out.println("please insert if its Dark");
        isDark = scanner.nextBoolean();

        System.out.println("please the speed of car");
        carSpeed = scanner.nextInt();

        isRunning = carSpeed > 100;
        isLightsOn = isRaining && (isRunning || isDark);

        System.out.println("the lights are on: " + isLightsOn);

    }
}
