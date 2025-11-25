import java.util.ArrayList;
import java.util.List;

public class NameList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Sara");
        names.add("Ali");
        names.add("Reza");
        names.add("Mina");

        System.out.println("=== List of Names ===");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
