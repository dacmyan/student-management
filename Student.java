public class Student {
    private int studentId;
    private String fullName;
    private double gpa;

    

    // Getters and Setters (đầy đủ)

    public Student(int studentId, String fullName, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }



    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



    public String getFullName() {
        return fullName;
    }



    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



    public double getGpa() {
        return gpa;
    }



    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

        @Override
    public String toString() {
        return String.format("| %-5d | %-20s | %.2f |", studentId, fullName, gpa);
    }
}
