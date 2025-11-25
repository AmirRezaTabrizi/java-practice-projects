import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to save: ");
        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(text);
            System.out.println("✅ Text saved to output.txt");
        } catch (IOException e) {
            System.out.println("❌ Error writing file.");
        }
    }
}
