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
