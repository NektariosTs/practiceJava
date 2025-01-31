package exercisesJAVA.Integers;

/**
 * X = 10
 * Y = 85
 * D = 30
 * <p>
 * Jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 */

/**
 * edw metatrepoume mesa sthn Math.ceil to hop se double etsi wste na mporesoume na paroume dekadiko giati h ceil kanei round app
 * dhladh pairnei to dekadiko kai to anevazei pros ta panw. kai meta metatrepoume ton dekadiko se int opote automatws pairnoume to 3.
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil((target - start) / (double) hop);

        System.out.println("Jumps: " + jumps);
    }
}
