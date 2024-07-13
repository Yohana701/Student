public class Main {
    public static void main(String[] args) {
        // Create a new student object
        Student student = new Student("April", 10);

        // Add some courses
        student.addCourse("Math");
        student.addCourse("Science");

        // Display student information
        System.out.println(student);

        // Remove a course
        student.removeCourse("Science");

        // Display student information after removing a course
        System.out.println("Updated Info: " + student);
    }
}
