import java.util.ArrayList;
import java.util.List;

public class GradeTracker {
    private String name;
    private List<Integer> grades;

    public void Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grades=" + grades + ", average=" + getAverageGrade() + '}';
    }
}
