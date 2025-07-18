public class Exception {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Can't divide by zero!");
        }

        System.out.println("Program continues after the error.");
    }
}
