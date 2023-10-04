public class Student {
    private int studentId;
    private String firstName;
    private String lastName;

    // Constructors, getters, and setters
    // ...

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
