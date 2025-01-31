package exercisesJAVA.Integers;

import java.util.Scanner;

public class PriceWithVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vat = 0.0;
        final double VAT_RATE = 0.24;
        double priceWithVat = 0.0;
        double inputPrice = 0.0;

        System.out.println("please insert the price");
        inputPrice = scanner.nextDouble();

        vat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + vat;

        System.out.println(
                "price is: " + inputPrice + " vat is: " + vat + " price with vat is: " + priceWithVat);
        System.out.printf("price is: %.2f, vat is: %.2f, total price with vat is: %.2f ", inputPrice, vat, priceWithVat);
    }
}
