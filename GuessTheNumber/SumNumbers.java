import java.util.Scanner;

public class SumNumbers {

    // 🔹 Method for adding numbers from 1 to N
    public static void sumNum(Scanner scanner) {

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+= i;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is " + sum);
    }
}
