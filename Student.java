public class Student {
    // properties (data)
    String name;
    int age;
    String course;

    // method (action)
    void StudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    // main method to run the program
    public static void main(String[] args) {
        Student s1 = new Student(); // creating object
        s1.name = "Ram";
        s1.age = 20;
        s1.course = "Java Programming";

        s1.StudentDetails(); // calling method
    
       Student s2 = new Student();
       s2.name = "Rajesh";
       s2.age = 23;
       s2.course = "Phython Programming";
       s2.StudentDetails();
       
    }
    
}
