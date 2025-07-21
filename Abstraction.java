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
