import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) { // keep looping until user chooses a valid option
            System.out.println("=== Day 13 – Loops Practice ===");
            System.out.println("Choose an option:");
            System.out.println("1. Sum numbers from 1 to N");
            System.out.println("2. Guess the number game");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Check if user entered a valid integer
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.❌\n");
                scanner.next(); // clear invalid input
                continue; // restart loop
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SumNumbers.sumNum(scanner);
                    break;
                case 2:
                    GuessTheNumber.guessTheNumber(scanner);
                    break;
                case 0:
                    System.out.println("👋 Goodbye!");
                    scanner.close();
                    return; // end program
                default:
                    System.out.println("\n❌Invalid choice. Please run again.❌");
            }

            System.out.println(); // print a blank line for spacing
        }
    }
}