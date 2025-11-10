import java.util.Scanner;

public class CountA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Day 9 – CountA ===");
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A')
                count++;
        }

        System.out.println("The letter 'a' appears " + count + " times.");
        scanner.close();
    }
}
