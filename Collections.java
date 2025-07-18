import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        
        ArrayList<String> studentNames = new ArrayList<>();

        
        studentNames.add("Rahul");
        studentNames.add("Sneha");
        studentNames.add("Amit");

        
        System.out.println("Student Names:");
         //  variable newvariable : stored variable
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
