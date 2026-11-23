
public class Q5 {

    public static void main(String args[]) {

        try {
            IO.println("Outer try block");

            try {
                int a = 10;
                int b = 0;

                int c = a / b;

                IO.println("Answer = " + c);
            } catch (ArithmeticException e) {
                IO.println("Cannot divide number by zero");
            }
        } catch (Exception e) {
            IO.println("Exception occurred");
        }
    }
}
