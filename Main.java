import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("1. Add student\n2. Delete\n3. Search\n4. Show all\n5. Exit");
            int choice = Integer.parseInt(sc.nextLine());

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("GPA: ");
                        double gpa = Double.parseDouble(sc.nextLine());
                        manager.addStudent(new Student(id, name, gpa));
                    }
                    case 2 -> {
                        System.out.print("Enter ID to delete: ");
                        int id = Integer.parseInt(sc.nextLine());
                        manager.deleteStudent(id);
                    }
                    case 3 -> {
                        System.out.print("Search name: ");
                        String name = sc.nextLine();
                        List<Student> found = manager.searchByName(name);
                        found.forEach(System.out::println);
                    }
                    case 4 -> manager.getAllStudents().forEach(System.out::println);
                    case 5 -> System.exit(0);
                    default -> System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
