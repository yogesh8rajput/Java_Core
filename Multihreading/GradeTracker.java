import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeTracker {
    private Map<String, Student> students;

    public GradeTracker() {
        students = new HashMap<>();
    }

    public void addStudent(String name) {
        if (!students.containsKey(name)) {
            students.put(name, new Student(name));
        } else {
            System.out.println("Student already registered.");
        }
    }

    public void addGrade(String name, int grade) {
        Student student = students.get(name);
        if (student != null) {
            student.addGrade(grade);
        } else {
            System.out.println("Student not registered.");
        }
    }

    public void printStudentInfo(String name) {
        Student student = students.get(name);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void printAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        GradeTracker tracker = new GradeTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Print Student Info");
            System.out.println("4. Print All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    tracker.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    tracker.addGrade(name, grade);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    tracker.printStudentInfo(name);
                    break;
                case 4:
                    tracker.printAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
