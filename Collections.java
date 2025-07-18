import java.util.ArrayList;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentListExample {
    public static void main(String[] args) {
        // Creating a collection to store Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Adding students to the list
        studentList.add(new Student("Rahul", 21));
        studentList.add(new Student("Sneha", 20));
        studentList.add(new Student("Amit", 22));

        // Displaying all student info
        for (Student s : studentList) {
            s.display();
        }
    }
}
