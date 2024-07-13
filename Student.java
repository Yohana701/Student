import java.util.ArrayList;
import java.util.List;

// Define the Student class
public class Student {
    // Instance variables
    private String name;
    private int grade;
    private List<String> courses;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove a course
    public void removeCourse(String course) {
        courses.remove(course);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + ", courses=" + courses + '}';
    }
}
