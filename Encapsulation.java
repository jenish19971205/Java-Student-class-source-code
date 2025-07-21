public class Student {
    private String name;
    private int age;
    private String address;

    
    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
    

    public void setAge(int newAge) {
        age = newAge;
    }

    
    public int getAge() {
        return age;
    }
    
    public void setAddress(String newAddress){
        address = newAddress;
    }
    
    public String getAddress(){
        return address;
    }
    

    public static void main(String[] args) {
        Student s1 = new Student();

        
        s1.setName("Ram");
        s1.setAge(21);
        s1.setAddress("Chennai");

        
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Address" + s1.getAddress());
    }
}
