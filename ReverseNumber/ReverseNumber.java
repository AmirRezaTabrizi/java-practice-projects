import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Day 7 – ReverseNumber ===");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Reversed: " + reverse(num));
        scanner.close();
    }

    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
