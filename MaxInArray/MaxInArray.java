import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("=== Day 6 – Find Max in Array ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max)
                max = num;
        }

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Maximum number: " + max);
        scanner.close();
    }
}
