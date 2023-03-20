import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Validation {
    private static final int userATM = 123;
    private static final int userPin = 123;
    private static final Scanner scanner = new Scanner(System.in);

    public static void validateUser() {
        System.out.print("Please Input ATM number: ");
        int atm = scanner.nextByte();

        System.out.print("input your pin: ");
        int pin = scanner.nextByte();

        Map<Integer,Integer> password = new HashMap<>();
        password.put(userATM, userPin);

        for (var item : password.entrySet()) {
            if (item.getKey() == atm && item.getValue() == pin)
                System.out.println("login successful!");
            else {
                System.out.println("incorrect credentials");
                System.exit(0);
            }
        }
    }
}