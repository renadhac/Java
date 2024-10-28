package student;

public class Student {
    // Non-static fields
    private String name;
    private int id;
    // Final field (constant)
    private final String university = "OpenAI University";
    // Static field
    private static int totalStudents = 0;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudents++; // Increment total students each time a student is created
    }

    // Non-static method
    public String getStudentInfo() {
        return "Name: " + name + ", ID: " + id + ", University: " + university;
    }

    // Static method
    public static int getTotalStudents() {
        return totalStudents;
    }
}
