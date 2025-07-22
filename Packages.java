
package mypackage;  // this line defines the package

public class Student {
    public void showInfo() {
        System.out.println("I am a student in a package.");
    }
}

// File: Main.java (outside the package folder)
//seperate class
import mypackage.Student;  // importing the class from the package

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.showInfo();
    }
}
/*
     If you’re using IntelliJ, it handles packages automatically.
Just make sure:
Student.java is inside a folder called mypackage
Main.java is outside or in another appropriate folder
You import the package properly

Def : 
package is just like a folder.
We put Student.java inside it, and then use import to bring that into Main.java.
This helps keep code clean and reusable, especially in big projects.
*/
