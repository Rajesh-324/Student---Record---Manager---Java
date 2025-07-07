public class Student {
    int id;
    String name;
    String branch;
    double marks;

    public Student(int id, String name, String branch, double marks) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Branch: " + branch + ", Marks: " + marks);
    }
}
