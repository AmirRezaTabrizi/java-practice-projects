import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("What's your name?");
        String name = scanner.nextLine();

        // Ask for the user's age
        System.out.print("How old are you?");
        int age = scanner.nextInt();

        // Print greeting message
        System.out.println("\nHello, " + name + "!");

        // Display their age next year
        System.out.println("Next year, you will be " + (age + 1) + " years old.");

        // Close the scanner, good practice
        scanner.close();
    }
}
