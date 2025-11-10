import java.util.Scanner;

public class MaxFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=== Day 8 – MaxFunction ===");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("The maximum is: " + max(a, b));
        scanner.close();
    }

    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
