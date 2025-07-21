class Student {
    String name;
    int age;
    
    
    void study() {
        System.out.println(name + " is studying.");
    }
    
    void Age() {
        System.out.println("My age is "+ age + ".");
    }


   public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ram";
        s1.study();
        
        Student s2 = new Student();
        s2.age = 26;
        s2.Age();
        
    
    }
 }
