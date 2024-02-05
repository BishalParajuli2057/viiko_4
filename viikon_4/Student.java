package viikon_4;

public class Student {
    private String name;
    private String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return studentNumber + ": " + name;
    }
}
