import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()) {
                throw new IllegalArgumentException("Duplicate student ID.");
            }
        }
        students.add(student);
    }

    public boolean deleteStudent(int id) {
        return students.removeIf(s -> s.getStudentId() == id);
    }

    public List<Student> searchByName(String name) {
        List<Student> results = new ArrayList<>();
        for (Student s : students) {
            if (s.getFullName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                results.add(s);
            }
        }
        return results;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
