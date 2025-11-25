import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        grades.put("Sara", 18.5);
        grades.put("Ali", 15.0);
        grades.put("Mina", 19.2);

        System.out.println("=== Student Grades ===");
        for (String name : grades.keySet()) {
            System.out.println(name + " → " + grades.get(name));
        }
    }
}
