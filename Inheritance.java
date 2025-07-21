//Single Inheritance

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

    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.attendClass();
    }
}
//Multiple Inheritance
