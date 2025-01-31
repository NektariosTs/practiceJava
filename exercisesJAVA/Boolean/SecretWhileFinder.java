package exercisesJAVA.Boolean;

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;
        do {
            System.out.println("insert the num to guess the secret");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Secret found!");
                isSuccess = true;// einai boolean , opote to vazoume true otan to vrei to programma ton arithmo giati alliws ton vriskei alla den stamataei to programma.sunexizei na douleuei.
            }else{
                System.out.println("try again.");
            }
        }while (!isSuccess);

    }

}
