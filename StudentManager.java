import java.util.*;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Student\n2. Display All\n3. Search by Name\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, branch, marks);
                    students.add(s);
                    System.out.println("Student added!");
                    break;

                case 2:
                    for (Student stud : students) {
                        stud.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (Student stud : students) {
                        if (stud.name.equalsIgnoreCase(search)) {
                            stud.display();
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
