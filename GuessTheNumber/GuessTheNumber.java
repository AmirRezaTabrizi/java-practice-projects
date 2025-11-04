import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // 🔹 Number guessing game method
    public static void guessTheNumber(Scanner scanner) {
        Random random = new Random();
        int target = random.nextInt(100) + 1; // ✅ range: 1–100
        int guess = 0;
        int attempts = 0;

        System.out.println("🎯 Guess the number between 1 and 100!");

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too low! Try again ⬆️");
            } else if (guess > target) {
                System.out.println("Too high! Try again ⬇️");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " tries.");
            }
        }
    }
}
