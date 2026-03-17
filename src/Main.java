import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        // Add students
        students.put("S1", new Student("Ali", 3.5, 20));
        students.put("S2", new Student("Bek", 3.8, 21));
        students.put("S3", new Student("Aida", 3.9, 19));
        students.put("S4", new Student("Nursultan", 3.5, 22));
        students.put("S5", new Student("Dana", 3.7, 20));

        // Print all students
        System.out.println("All students:");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Find student by ID
        System.out.println("\nFind student S3:");
        System.out.println(students.get("S3"));

        // Update GPA
        students.get("S1").setGpa(3.9);

        System.out.println("\nUpdated GPA of S1:");
        System.out.println(students.get("S1"));

        // Remove student
        students.remove("S5");

        System.out.println("\nAfter removing S5:");
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }
}