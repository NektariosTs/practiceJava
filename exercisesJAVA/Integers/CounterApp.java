package exercisesJAVA.Integers;

/*
 * count steps up , distance down by one
 */
public class CounterApp {
    public static void main(String[] args) {
        int steps = 0;
        int distance = 0;

        System.out.printf("Steps is: %d, Distance is: %d\n", steps++, distance--);
        System.out.printf("Steps is: %d, Distance is: %d\n", steps++, distance--);
        System.out.printf("Steps is: %d, Distance is: %d\n", steps++, distance--);
        System.out.printf("Steps is: %d, Distance is: %d ", steps, distance);
    }
}
