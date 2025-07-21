//Single Inheritance :


class Student {
    void study() {
        System.out.println("I am studying.");
    }
}
// seperate class
class CollegeStudent extends Student {
    void attendClass() {
        System.out.println("I am attending college class.");
    }
//main method
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.attendClass();
    }
}


/*Multilevel Inheritance :

  Multilevel Inheritance = One class extends another, and another class extends that.
  So it’s like a chain of classes passing features down.
  Final class can use everything from above. 
*/

class Student {
    void study() {
        System.out.println("I am studying.");
    }
}
// seperate class
class CollegeStudent extends Student {
    void attendClass() {
        System.out.println("I am attending college classes.");
    }
}
// seperate class
class EngineeringStudent extends CollegeStudent {
    void doLab() {
        System.out.println("I am doing lab work.");
    }
//main method
    public static void main(String[] args) {
        EngineeringStudent eng = new EngineeringStudent();
        eng.study();         // from Student
        eng.attendClass();   // from CollegeStudent
        eng.doLab();         // from EngineeringStudent
    }
}
/* Hierarchical inheritance :
      One parent class is shared by multiple child classes.
      One base class is shared by multiple child classes.
      Each child gets features from the same parent, and can have its own too.
      It’s useful when different types of things share common stuff, but do their own tasks also.
*/

class Student {
    void study() {
        System.out.println("I am studying.");
    }
}
//seperate class
class SchoolStudent extends Student {
    void writeExam() {
        System.out.println("I am writing school exams.");
    }
}
//seperate class
class CollegeStudent extends Student {
    void attendClass() {
        System.out.println("I am attending college classes.");
    }

 //main method   
    public static void main(String[] args) {
        SchoolStudent school = new SchoolStudent();
        school.study();       // from Student
        school.writeExam();   // from SchoolStudent

        CollegeStudent college = new CollegeStudent();
        college.study();       // from Student
        college.attendClass(); // from CollegeStudent
    }
}
/*
        this is like one common parent class — Student.
        Then we have two Childclass — SchoolStudent and CollegeStudent — both using the same parent’s features.
        Like both are calling study() from Student class, but doing their own stuff also.
        One is attending class, other is writing exam.
        This is called Hierarchical Inheritance — many children, one parent.
    */
