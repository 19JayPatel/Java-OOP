//try catch block using sample code

public class Q2 {
    void main() {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            IO.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            IO.println("Error: Cannot divide by zero.");
        }

        IO.println("Program continues...");
    }
}