/*Compile time polymorphism :

     Java knows exactly which study() to run just by checking the input types when compiling the code.
     No confusion — all methods have different arguments.
*/

class Student {
    void study() {
        System.out.println("I am studying.");
    }

    void study(String subject) {
        System.out.println("I am studying " + subject + ".");
    }

    void study(int hours) {
        System.out.println("I am studying for " + hours + " hours.");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.study();            // I am studying.
        s.study("Maths");     // I am studying Maths.
        s.study(3);           // I am studying for 3 hours.
    }
}
/*
     Run Time Polymorphism :
     
       At compile time, Java only sees Student type.
       But at runtime, the object is actually CollegeStudent, so that version of study() runs.
       This is called Method Overriding.

*/
   
class Student {
    void study() {
        System.out.println("I am a general student studying.");
    }
}

class CollegeStudent extends Student {
    void study() {
        System.out.println("I am a college student studying with more pressure!");
    }

    public static void main(String[] args) {
        Student s = new CollegeStudent();  // parent reference, child object
        s.study();  // Output: I am a college student studying with more pressure!
    }
}
