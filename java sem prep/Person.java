public class Person {
    private String name;
    private int age;

    // Constructor of Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Student extends Person {
    private String studentId;

    // Constructor of Student class
    public Student(String name, int age, String studentId) {
        // Call the superclass constructor using super
        super(name, age);
        this.studentId = studentId;
    }

    // Method to display student's details
    @Override
    public void display() {
        // Call the display method of the superclass
        super.display();
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student("Alice", 20, "S12345");

        // Display student's details
        student.display();
    }
}
