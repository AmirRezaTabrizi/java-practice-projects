import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Grade Checker ===");
        System.out.print("Enter your score (0-20): ");
        int score = scanner.nextInt();

        // Check for valid input
        if (score < 0 || score > 20) {
            System.out.println("⚠️ Please enter a valid score between 0 and 20.");
            scanner.close();
            return;
        }

        // Check pass or fail
        if (score > 10) {
            System.out.println("Result: Passed ✅");
        } else {
            System.out.println("Result: Failed ❌");
        }

        // Determine letter grade
        String grade;

        switch (score / 3) {
            case 6: // 18-20
            case 7:
                grade = "A";
                break;
            case 5: // 15-17
                grade = "B";
                break;
            case 4: // 12-14
                grade = "C";
                break;
            case 3: // 10-11
                grade = "D";
                break;
            default: // less than 10
                grade = "F";
        }

        System.out.println("Letter grade: " + grade);

        scanner.close();
    }
}
