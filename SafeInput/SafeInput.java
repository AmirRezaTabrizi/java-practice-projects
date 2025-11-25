import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");

        try {
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input! Please enter a valid number.");
        }
    }
}
