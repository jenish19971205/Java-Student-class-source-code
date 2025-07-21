abstract class Student {
    abstract void study();  // Rule – no body

    void sleep() {
        System.out.println("I am sleeping.");
    }
}

class CollegeStudent extends Student {
    void study() {
        System.out.println("I am studying for college exams.");
    }

    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.study();   // I am studying for college exams.
        cs.sleep();   // I am sleeping.
    }
}
/*
      Student gives a rule: “Every student must study()”
      CollegeStudent follows that rule and writes its own version
      But sleep() is already written in parent, so child can use it directly
      This is called partial abstraction — some methods have body, some don’t.

*/
interface Student {
    void study();  // Rule
    void play();   // Rule
}

class SchoolStudent implements Student {
    public void study() {
        System.out.println("I study from textbooks.");
    }

    public void play() {
        System.out.println("I play football.");
    }

    public static void main(String[] args) {
        SchoolStudent ss = new SchoolStudent();
        ss.study();  // I study from textbooks.
        ss.play();   // I play football.
    }
}
/*
      Student interface = list of rules
      Any class that uses it must write all the method bodies
      So outside world only sees the rule names, not the actual logic
      This is 100% abstraction.

*/

