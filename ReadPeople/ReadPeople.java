import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadPeople {
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                people.add(line);
            }

            System.out.println("=== People from File ===");
            for (String p : people) {
                System.out.println(p);
            }

        } catch (IOException e) {
            System.out.println("❌ Error reading file");
        }
    }
}
