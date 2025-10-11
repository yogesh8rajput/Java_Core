import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Create an ArrayList to hold Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add some students and grades
        Student alice = new Student("Alice");
        alice.addGrade(90%);
        alice.addGrade(85%);
        alice.addGrade(88%);
        students.add(alice);

        Student bob = new Student("Bob");
        bob.addGrade(76);
        bob.addGrade(82);
        bob.addGrade(80);
        students.add(bob);

        // Calculate and display average grades for each student
        for (Student student : students) {
            System.out.println(student);
        }

        // Optionally, calculate overall class average
        double totalAverage = 0;
        for (Student student : students) {
            totalAverage += student.getAverageGrade();
        }
        totalAverage /= students.size();
        System.out.println("Class Average Grade: " + totalAverage);
    }
}
