package exercisesJAVA.Boolean;

/*
 * Calculate the sum and mul of
 * first 10 integers.*/

public class SumMul {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        int j = 1;
        int mul = 1;

        while (i <= 10) {
//            sum = sum + i;
            sum += i;
            i++;
            System.out.println(sum);
        }

        System.out.println();

        while (j <= 10) {
//            mul = mul * j;
            mul *= j;
            j++;
            System.out.println(mul);
        }
    }
}
