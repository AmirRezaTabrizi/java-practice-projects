import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Create a scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Java Calculator ===");

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the operator (+, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        double result = 0;


        // Perform operations based on the operator
        result = (operator == '+') ? (number1 + number2)
                : (operator == '*') ? (number1 * number2)
                : (operator == '/' ?
                    (number2 != 0 ? (number1 / number2) : Double.NaN)
                : Double.NaN);

        if (Double.isNaN(result)) {
            if (operator == '/' && number2 == 0)
                System.out.println("Error: Division by zero is not allowed!");
            else
                System.out.println("The operator is invalid!");
            scanner.close();
            return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
